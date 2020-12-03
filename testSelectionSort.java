/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testMixed();
		testDuplicates();
	}

  public void testMixed(){
    /** Test data contains with both positive, negative and zeros **/
  int[] arr = new int[5];
    arr[0] = -10;
    arr[1] = 5;
    arr[2] = 10;
    arr[3] = -5;
    arr[4] = 0;

    int[] Sortedarr = new int[5];
    Sortedarr[0] = -10;
    Sortedarr[1] = -5;
    Sortedarr[2] = 0;
    Sortedarr[3] = 5;
    Sortedarr[4] = 10;

    /** add tests to check for this unit test **/
    SelectionSort temp1 = new SelectionSort();
    int returnedArray[] = temp1.basicSelectionSort(arr);

    for(int i = 0; i < 5; i++) {
      assertEquals(Sortedarr[i], returnedArray[i]);
    }
  }

    public void testDuplicates(){
        /** Test data contains duplicates **/
        int[] arr = new int[5];
        arr[0] = -2;
        arr[1] = 2;
        arr[2] = 50;
        arr[3] = 2;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 2;
        Sortedarr[3] = 2;
        Sortedarr[4] = 50;

        /** add tests to check for this unit test **/
        SelectionSort temp1 = new SelectionSort();
        int returnedArray[] = temp1.basicSelectionSort(arr);

        for(int i = 0; i < 5; i++) {
          assertEquals(Sortedarr[i], returnedArray[i]);
        }
    }
}
