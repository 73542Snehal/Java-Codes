package classandobjects;

public class PolynomialObject {
	
	    int[] degreeCoeff;
	    
	    public PolynomialObject() {
	        this.degreeCoeff = new int[5];
	    }
	     
	    public void setCoefficient(int degree, int coeff) {
	         
	        if(degree >= degreeCoeff.length) {
	            int[] newDegreeCoeff = new int[degree + 1];
	            for(int i = 0; i < degreeCoeff.length; i++) {
	                newDegreeCoeff[i] = degreeCoeff[i];
	            }
	            degreeCoeff = newDegreeCoeff;
	        }
	        degreeCoeff[degree] = coeff;
	    }
	     
	    public void print() {
	        for(int i = 0; i < degreeCoeff.length; i++) {
	            if(degreeCoeff[i] != 0) {
	                System.out.print(degreeCoeff[i] + "x" + i + " ");
	            }
	        }
	    }
	     
	    public PolynomialObject add(PolynomialObject p) {
	    	PolynomialObject  sum = new PolynomialObject();
	        int i = 0, j = 0;
	        while(i < this.degreeCoeff.length && j < p.degreeCoeff.length) {
	            sum.setCoefficient(i, this.degreeCoeff[i] + p.degreeCoeff[i]);
	            i++;
	            j++;
	        }
	         
	        while(i < this.degreeCoeff.length) {
	            sum.setCoefficient(i, this.degreeCoeff[i]);
	            i++;
	        }
	         
	        while(j < p.degreeCoeff.length) {
	            sum.setCoefficient(j, p.degreeCoeff[j]);
	            j++;
	        }
	        return sum;
	    }
	     
	    public PolynomialObject subtract(PolynomialObject p) {
	    	PolynomialObject  diff = new PolynomialObject();
	        int i = 0, j = 0;
	        while(i < this.degreeCoeff.length && j < p.degreeCoeff.length) {
	            diff.setCoefficient(i, this.degreeCoeff[i] - p.degreeCoeff[i]);
	            i++;
	            j++;
	        }
	         
	        while(i < this.degreeCoeff.length) {
	            diff.setCoefficient(i, this.degreeCoeff[i]);
	            i++;
	        }
	         
	        while(j < p.degreeCoeff.length) {
	            diff.setCoefficient(j, -p.degreeCoeff[j]);
	            j++;
	        }
	        return diff;
	    }
	     
	    public PolynomialObject multiply(PolynomialObject p) {
	    	PolynomialObject product = new PolynomialObject();
	        for(int i = 0; i < this.degreeCoeff.length; i++) {
	            for(int j = 0; j < p.degreeCoeff.length; j++) {
	                int newCoeff = this.degreeCoeff[i] * p.degreeCoeff[j];
	                int newDegree = i + j;
	                int oldValue = 0;
	                if(newDegree < product.degreeCoeff.length){
	                   oldValue = product.degreeCoeff[newDegree];
	                }
	                newCoeff = newCoeff + oldValue;
	                product.setCoefficient(newDegree, newCoeff);
	            }
	        }
	        return product;
	    }

	}



