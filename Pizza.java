

import java.util.*;
import java.lang.*;
import java.io.*;

class Pizza{
	private  String size;
	private  boolean cheese; 
	private  boolean pepperoni;
	private  boolean isThinCrust;
	private  boolean extraOlive;
	
	private Pizza() {}

    @Override
    public String toString() {
        return "Pizza {" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", thinCrust=" + isThinCrust +
                ", extraOlive=" + extraOlive +
                '}';
    }

	
	static class Builder {
		private String size;
      	private boolean cheese; 
		private boolean pepperoni;
		private boolean isThinCrust;
		private boolean extraOlive;
		
		Builder(String size){
			this.size = size;
		}
		public Builder addCheese(){
			this.cheese=true;
			return this;
		}
		public Builder addPepperoni(){
			this.pepperoni=true;
			return this;
		}
		public Builder addThinCrust(){
			this.isThinCrust=true;
			return this;
		}
		public Builder addExtraOlive(){
			this.extraOlive=true;
			return this;
		}
	    Pizza build(){
	    	Pizza pizza = new Pizza();
	    	pizza.size = this.size;
	    	pizza.cheese = this.cheese;
	    	pizza.pepperoni =  this.pepperoni;
	    	pizza.isThinCrust = this.isThinCrust;
	    	pizza.extraOlive = this.extraOlive;
	    	
	    	return pizza;
	    }
	}
}
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Pizza pizza = new Pizza.Builder("Large")
                            .addCheese()
                            .addPepperoni()
                            .addThinCrust()
                            .addExtraOlive()
                            .build();

        System.out.println(pizza);
	}
}
