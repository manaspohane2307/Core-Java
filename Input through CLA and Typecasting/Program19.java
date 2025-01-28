class Program19{
	public static void main(String args[]){
		int i,n;
		n = Integer.parseInt(args[0]);
		i=2;
		while(i <= n-1){
			if(n%i == 0){
				System.out.println("\n Not Prime");
				break;
			}
			i++;
		}
		if(i==n){
			System.out.println("Prime");
		}
	}
}