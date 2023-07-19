package maxPriorityQueue;

import java.util.*;
public class ProrityQueueUse {
	 static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) throws PriorityQueueException{

		  PQ pq = new PQ();
	        int choice = sc.nextInt();
	        while(choice != -1) {
				switch(choice) {
					case 1 : // insert
						int element = sc.nextInt();
						pq.insert(element);
						break;
					case 2 : // getMax
						System.out.println(pq.getMax());
						break;
					case 3 : // removeMax
						System.out.println(pq.removeMax());
						break;
					case 4 : // size
						System.out.println(pq.getSize());
						break;
					case 5 : // isEmpty
						System.out.println(pq.isEmpty());
					default :
							return;
				}
				//choice = Integer.parseInt(st.nextToken());
	            choice = sc.nextInt();
			}
		}

	}
