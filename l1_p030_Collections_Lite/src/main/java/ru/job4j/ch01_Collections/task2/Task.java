package ru.job4j.ch01_Collections.task2;

public class Task {
   private String desc;
   private int priority;

   public Task(String desc, int priority) {
      this.desc = desc;
      this.priority = priority;
   }

   public String getDesc() {
      return desc;
   }

   public int getPriority() {
      return priority;
   }
}
