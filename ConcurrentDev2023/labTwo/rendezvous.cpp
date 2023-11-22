#include "Semaphore.h"
#include <thread>
#include <vector>
#include <iostream>
#include <unistd.h>

/*! displays the first function in the barrier being executed */
void task(std::shared_ptr<int> arrivedAtBarrier, std::shared_ptr<Semaphore> mutexSem,std::shared_ptr<Semaphore> barrierSem, int threadCount){

    
  std::cout << "Before Rendezvousn" << std::endl;
    // Use the mutex to ensure proper updates to the shared variable
    mutexSem->Wait();
    *arrivedAtBarrier += 1;
    mutexSem->Signal();

    if (*arrivedAtBarrier == threadCount) {
        // All threads have reached the rendezvous point, release them
        for (int i = 0; i < threadCount; ++i) {
            barrierSem->Signal();
        }
    }

    // Wait at the rendezvous point
    barrierSem->Wait();

    // Continue execution after the rendezvous
    std::cout << "After Rendezvous/n" << std::endl;
}




int main(void){
  std::shared_ptr<Semaphore> mutexSem;
  std::shared_ptr<Semaphore> barrierSem;
  std::shared_ptr<int> arrivedAtBarrier;
  int threadCount = 5;
  mutexSem=std::make_shared<Semaphore>(1);
  barrierSem=std::make_shared<Semaphore>(0);
  arrivedAtBarrier=std::make_shared<int>(0);
  /*!< An array of threads*/
  std::vector<std::thread> threadArray(threadCount);
  /*!< Pointer to barrier object*/

  for(int i=0; i < threadArray.size(); i++){
    threadArray[i]=std::thread(task,arrivedAtBarrier,mutexSem,barrierSem,threadCount);
  }

  for(int i = 0; i < threadArray.size(); i++){
    threadArray[i].join();
  }
  
  return 0;
}
