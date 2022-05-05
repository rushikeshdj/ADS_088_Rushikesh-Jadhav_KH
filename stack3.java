class stack3{
	int arr1[];
	int top1,top2;
	int n1,size;
	
	stack3(int n1){
		size=n1;
		arr1=new int[n1];
		top1=n1/2+1;
		top2=n1/2;
	}
	
	void push1(int a){
		if (top1>0){
			top1--;
			arr1[top1]=a;
		}
		else{
			System.out.println("overflow!!!");
			
		}
		
	}
	
	void push2(int b){
		if (top2<(size-1)){
			top2++;
			arr1[top2]=b;
		}
		else{
			System.out.println("overflow!!!");
			
		}
		
	}
	
	int pop1(){
		if(top1<=size/2){
		int a=arr1[top1];
		top1++;
			System.out.println("Popped element from stack1 is "+a);
		return a;
		}else{
			System.out.println("underflow!!!");
		return 0;
		}
		
	}
	
	int pop2(){
		if(top2>=size/2+1){
		int b=arr1[top2];
		top2--;
		System.out.println("Popped element from stack2 is "+b);
		return b;
		}else{
			System.out.println("underflow!!!");
		return 0;
		}
	}
	
	
	
	public static void main(String[] args){
		stack3 obj=new stack3(10);
		obj.push1(5); 
		obj.push2(10); 
		obj.push2(15); 
		obj.push1(11); 
		obj.push2(7); 
		obj.push2(40);
		
		
	   obj.pop1();
		obj.pop2();
		
		
	
		
	}
	
}