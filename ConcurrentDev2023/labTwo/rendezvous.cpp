#include "Semaphore.h"
#include <thread>
#include <vector>
#include <iostream>
#include <unistd.h>

/*! displays the first function in the barrier being executed */
void task(std::shared_ptr<int> arrivedAtBarrier, std::shared_ptr<Semaphore> mutexSem,std::shared_ptr<Semaphore> barrierSem, int threadCount){

  std::cout << "first " << std::endl;
  mutexSem ->Wait();
  
  *arrivedAtBarrier+=1;
  if(*arrivedAtBarrier == threadCount){
    barrierSem ->Signal();
    
  }
  //put barrier code here
  std::cout << "second" << std::endl;
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
