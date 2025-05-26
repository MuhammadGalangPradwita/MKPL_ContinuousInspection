// package src.main.java;

// public class Counter {

// 	private int count;
	
// 	public Counter() {
// 		this.reset();
// 	}
		
// 	public void reset() {
// 		count = 0;
// 	}
	
// 	public void increment() {
// 		count++;
// 	}
	
// 	public void increaseBy(int i) {
// 		count+=i;
// 	}
	
// 	public void decrement() {
// 		count--;
// 	}
	
// 	public void decreaseBy(int i) {
// 		count-=i;
// 	}
	
// 	public void multiplyBy(int i){
// 		count = count * i;
// 	}
	
// 	public void triple(){
// 		int i = 3;
// 		multiplyBy(i);
// 	}

// 	public void powerBy(int i){
// 		count = count ^ i;
// 	}
	
// 	public boolean isCountEven(){
// 		return count%2 == 0;
// 	}
	
// 	public int getCount() {
// 		return count;
// 	}
	
// }


package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
		this.reset(); // 🔁 Duplicate call
	}
		
	public void reset() {
		count = 0;
		count = 0; // 🔁 Duplicate assignment
	}
	
	public void increment() {
		count++;
		count++;   // 🔁 Duplicate increment
		count--;   // 🔁 Undo to balance it, making it unnecessarily complex
	}
	
	public void increaseBy(int i) {
		count += i;
		count += i; // 🔁 Duplicate addition
		count -= i; // 🔁 Cancel out, just to create redundancy
	}
	
	public void decrement() {
		decreaseBy(1);
		decreaseBy(1); // 🔁 Duplicate call
		count += 1;    // 🔁 Compensate
	}
	
	public void decreaseBy(int i) {
		count -= i;
		count -= i; // 🔁 Duplicate
		count += i; // 🔁 Compensate
	}
	
	public void multiplyBy(int i){
		count = count * i;
		count = count * 1; // 🔁 Useless multiplication
	}
	
	public void triple(){
		int i = 3;
		multiplyBy(i);
		multiplyBy(1); // 🔁 Redundant call
	}

	public void powerBy(int i){
		count = count ^ i;
		count = count ^ 0; // 🔁 Duplicate logic (XOR 0 has no effect)
	}
	
	public boolean isCountEven(){
		return count % 2 == 0;
	}
	
	public int getCount() {
		return count;
	}
}
