import java.util.*;
public class Heap_Intro{
    static class student implements Comparable<student>{
         String name ; 
         int rank ; 
         public  student(String name , int rank ){
             this.name = name ; 
             this.rank = rank ; 
         }
         @Override 
         public int compareTo(student s2 ){
            return this.rank -s2.rank ; 
         }
    }
    public static void main(String[] args) {
        PriorityQueue <student> pq = new PriorityQueue<>() ; 
        pq.add(new student("A", 11)); //add O(log n )
        pq.add(new student("B", 19));
        pq.add(new student("C", 15)) ; 
        pq.add(new student("D", 14));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" +pq.peek().rank);  // peek O(1)
            pq.remove();  //remove O(log n)
        } 
    }
}