/**
 * 
 */
package com.avi.trial;
import java.util.Scanner;

import org.omg.CORBA.FREE_MEM;

/**
 * @author Avinash_Himanshu
 *
 */

	public class ArrayTest {
	void processArray(int []ar) {
	int iarr[]= new int[ar.length-1];
	for(int i=0;i<ar.length-1;i++) { 
			if(ar[i]<100 && ar[i]%10==6)
				{iarr[i]=-3;}
			else if(ar[i]>=0 && ar[i]<100){
	iarr[i]=-2; 
				}
			else if (ar[i]%10==6){
				iarr[i]=-1;
	}
	
	else {iarr[i]=ar[i];}
	if(ar[i]<0) break;
	System.out.println(ar[i]+ ":"+iarr[i]);
	}

	}
	public static void main(String args[]) {
	ArrayTest at = new ArrayTest();
	int []ar=new int[10];
	int k=0;

	System.out.println(" Enter any Integer , to end press -1");
	Scanner in = new Scanner(System.in);

	for(int i=0;true;i++)
	{

	k= in.nextInt();

	ar[i] = new Integer(k);
	if(k<0)
		
		break;

	}

	at.processArray( ar);
	}

	}
