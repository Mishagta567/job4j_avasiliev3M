package ru.job4j.p1CollectionsFramework.task2;

import java.util.LinkedList;

public class PriorityQueue {
   private LinkedList<Task> tasks = new LinkedList<Task>();

   /**
    * Метод должен вставлять в нужную позицию элемент.
    * Позиция определять по полю приоритет.
    * Для вставик использовать add(int index, E value)
    * @param task задача
    */
   public void put(Task task) {

      if (tasks.isEmpty()) {
         tasks.add(task);
      } else {
         int queueSize = tasks.size();
         for (int i = 0; i < queueSize; i++) {
            if (task.getPriority() < tasks.get(i).getPriority() ) {
               tasks.add(i, task);
            } else if (i == queueSize - 1) {
               tasks.addLast(task);
            }
         }
      }
   }

   public Task take() {
      return this.tasks.poll();
   }
}
