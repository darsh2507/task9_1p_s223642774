package web.service;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {

	  @Test
	   public void testTrueAddition() {
		Assert.assertEquals(MathQuestionService.q1Additions("1", "2"), 3, 0);
	   }

	   @Test(expected = NumberFormatException.class)
	    public void testAddNumber1Empty() {
		 MathQuestionService.q1Additions("", "2");
	   }	
	    @Test(expected = NumberFormatException.class)
	     public void testAddNumber2Empty() {
		 MathQuestionService.q1Additions("3", "");
	    }

	    @Test(expected = NumberFormatException.class)
	    public void testAddBothNumbersEmpty() {
	    	 MathQuestionService.q1Additions("", "");
	    }
	    @Test
	    public void testAddNegativeNumbers() {
	        Assert.assertEquals(MathQuestionService.q1Additions("-2", "-3"), -5.0, 0);
	    }

	    @Test
	    public void testAddDecimalNumbers() {
	        Assert.assertEquals(MathQuestionService.q1Additions("2.5", "3.7"), 6.2, 0.0001);
	    }
	    @Test
	    public void testTrueSubtract() {
	        Assert.assertEquals(MathQuestionService.q2Subtraction("5", "3"), 2.0, 0);
	    }

	    @Test (expected = NumberFormatException.class)
	    public void testSubtractNumber1Empty() {
	    	 MathQuestionService.q2Subtractions("", "2");
	    }
	    @Test (expected = NumberFormatException.class)
	    public void testSubtractNumber2Empty() {
	    	 MathQuestionService.q2Subtractions("3", "");
	    }

	    @Test (expected = NumberFormatException.class)
	    public void testSubtractBothNumbersEmpty() {
	    	  MathQuestionService.q2Subtractions("", "");
	    }

	    @Test
	    public void testSubtractNegativeNumbers() {
	        Assert.assertEquals(MathQuestionService.q2Subtraction("-5", "-2"), -3.0, 0);
	    }

	    @Test
	    public void testSubtractDecimalNumbers() {
	        Assert.assertEquals(MathQuestionService.q2Subtraction("7.5", "2.3"), 5.2, 0.0001);
	    }
}
