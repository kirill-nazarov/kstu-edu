#include <stdio.h>
#include <cstdlib>
#include <ctime>
#include <iostream>
 
using namespace std;
 
int main()
  {
  const int MAXSIZE = 5;
  int myArray[MAXSIZE+1];
  srand((unsigned)time(0));
  for(int i=1; i<MAXSIZE+1; i++)
    {
    myArray[i] = (rand()%100)+1;
    cout << myArray[i] << "  ";
    }
  cout << "(Initial array)" << "\n";
 
  int pass;
  int tempValue;
  int noSwaps;
  int time2stop;
  pass = 1;
  time2stop = 0;
  while (time2stop == 0)
	{
	noSwaps = 1;
	for (int i=1; i<=(MAXSIZE-pass); i++)
	  {
	  if (myArray[i] > myArray[i+1])
	    {
		tempValue = myArray[i];
		myArray[i] = myArray[i+1];
		myArray[i+1] = tempValue;
		noSwaps = 0;
		for (int j=1; j<=MAXSIZE; j++)
		  {
		  cout << myArray[j] << "  ";
		  }
		cout << "\n";
		}
	  }
	if (noSwaps == 1)
	  {
	  time2stop = 1;
	  }
    }
 
	for(int i=1; i<MAXSIZE+1; i++)
      {
      cout << myArray[i] << "  ";
      }
	cout << "(Sorted array)" << "\n";
  cout << "\nPress ENTER to continue..." << endl;
  getchar();
  } 
 