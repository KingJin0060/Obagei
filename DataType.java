public class DataType{
    public static void main(String[] args){
	    //Integer type (byte,short,int,long)
		byte age = 50;
		System.out.printf("You are %d years old years %n",age);
		
		short quantity = 20000;
		System.out.printf("I bought%d quantity of bags for my business%n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The population in Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 80000000;
		System.out.printf("The world population in %d%n",worldPopulation);
		
		//float-point numbers(float, double)
		float weight = 5.6F;
		System.out.printf("The bag of rice was %fkg%n",weight);
       
	    double acctBalance = 467666.94776;
        System.out.printf("Your account balance is %c%.2f",'$',acctBalance);
		
		//Boolean type(boolean)
		boolean isJavaFun = true;
		System.out.printf("Is Java Fun? %b%n",isJavaFun);
		
		//character type character
		char alpha = '@';
		System.out.printf("My email is monkeyking0060%cgmail.com",alpha);
    }



}