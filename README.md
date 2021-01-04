# 3RatesTaxCalculationProgram

## Table of contents 

* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Description](#description)
* [Inspiration](#inspiration)

## General info 

This is a console application which calculates the amount of 5%, 8% and 23% tax. User can choose two options: the gross price and the net price.

## Technologies 

* Java 13 

## Setup 

This is a console apllication, however it should be started on at least JDK 12 after cloning project to IDE.

## Description
### class Main{}

In the **Main class{}**, above the **main(String[] args)** method are located three project's arguments: the **Scanner scn**, **boolean shouldContinue** and the **Methods methods**. All mentioned arguments have a **private** modifier due to the encapsulation. Moreover these arguments have also a static modifier due to possibility of using them in this class.

At the beginning when the program runs, user receives a welcome message. User is also asked to choose options from 1 to 3. **Scanner scn** reads the input data from the user. 
Next the variable **int userChoice** retrieves the number. The **switch(userChoice)** depends on the mentioned **int userChoice** number entered by the user.

In this porgram the person who wants to calculate the tax can choose 3 options using the **switch(userChoice)** function:

* **case 1->**	Calculate the tax from the gross price.
* **case 2->**	Calculate the tax from the net price.
* **case 3->**	Terminate the program.

The calculations in the **case 1** and int the **case 2** are performed by functions located in the **Methods class**. These operations are possible due to the mentioned encapsulation. The **Methods metody** run methods, which are located in the **Methods{} class**.

The **case 3** is performed by **boolean shouldContinue**. Implicitly this variable is encapsulated and setted for **true**, so changing it to **false**, terminates the program.

The **switch(userChoice)** has a **default** option to protect from the user’s invalid number input. If the user inputs the wrong number, he/she will receive a message and he/she will have an opprtunity to do this again by the **scn.nextInt();**

The **switch(userChoice)** is also located in the **try/catch** block to catch the exception if the user inputs an invalid data (becuase the **default** option protects only from the incorrect number input). If the user inputs an incorrect data he/she will receive a message and he/she will have a chance to do this again by the **scn.next();**.

This porgram is also located in the **while(shouldContinue)** loop to provide a constant running.
The **boolean shouldContinue** serves to continue the **while(shouldContinue)** loop and to terminates the application when the user will choose the **case 3** in the **switch(userChoice)**.

What is more the **case 1** and the **case 2** which are located in the **switch(userChoice)** have their own switch options inside.

### case 1 in the switch(userChoice)

After choosing the **case 1** in the **switch(userChoice)**, the user is asked to choose options from 1 to 4. The **Scanner scn** reads the input data from the user. 
Next the variable **int userChoiceGross** retrieves the number. The **switch(userChoiceGross)** depends on the mentioned **int userChoiceBrutto** number entered by the user.
User who chooses the **case 1** (calculate the tax from the gross price) in the **switch(userChoice)** will have 4 options in the **switch(userChoiceGross)**:

* **case 1->** Calculate the 23% tax from the gross price.
* **case 2->** Calculate the 8% tax from the gross price.
* **case 3->** Calculate the 5% tax from the gross price.
* **case 4->** Back to the main menu.

The **switch(userChoiceGross)** has a default option to protect from the user’s invalid number input. 
If the user inputs a wrong number, he/she wiil receive a message and he/she will have an opprtunity to do this again by the **scn.nextInt()**;

The **switch(userChoiceGross)** is also in the **try/catch** block to catch the exception if the user inputs an invalid data (becuase the default option protects only from the incorrect number input). 
If the user inputs an incorrect data he/she will receive a message and he/she will have a chance to do this again by the **scn.next();**.

The **switch(userChoiceGross)**  is also located in the **while(shouldContinueGross)** loop to provide a constant running.

The **boolean shouldContinueGross** serves to continue the **while(shouldContinueGross)** loop and to returning to the main menu when user will choose the **case 4** in the **switch(userChoiceGross)**.

### case 2 in the switch(userChoice)

After choosing the **case 2** in the switch(userChoice), the user is asked to choose options from 1 to 4. The **Scanner scn** reads the input data from the user. 
Next the variable **int userChoiceNet** retrieves the number. 
The **switch(userChoiceNetto)** depends on the mentioned **int userChoiceNet** number entered by the user.
User who chooses the **case 2**(calculate the tax from the net price) in the **switch(userChoice)** will have 4 options in the **switch(userChoiceNet)**:

* **case 1->** Calculate the 23% tax from the net price.
* **case 2->** Calculate the 8% tax from the net price.
* **case 3->** Calculate the 5% tax from the net price.
* **case 4->** Back to the main menu.

The **switch(userChoiceNet)** has a **default** option to protect from the user’s invalid number input. If the user inputs the wrong number, he/she wiil receive a message and he/she will have an opprtunity to do this again by the **scn.nextInt();**.

The **switch(userChoiceNetto)** is also in **try/catch block** to catch the exception if the user inputs an invalid data (becuase the **default** option protects only from the incorrect number input). 
If the user inputs an incorrect data he/she will receive a message and he/she will have a chance to do this again by the **scn3.next();**.

The **switch(userChoiceNet)** is also located in the **while(shouldContinueNet)** loop to provide a constant running.

The boolean **shouldContinueNet** serves to continuing the **while(shouldContinueNet)** loop and to returning the main menu when user chooses the **case 4** in the **switch(userChoiceNet)**.

### class Methods{}

All methods (**calculateGross23()**, **calculateGross8()**, **calculateGross5()**, **calculateNet23()**, **calculateNet8()**, **calculateNet5()**) in the **Methods{}** class work in the same way. However below is a detailed description with all variables.

#### calculateBrutto23()

The **calculateBrutto23()** method runs when user chooses **case 1** in the **switch(userChoice)** and **case 1** in the **switch(userChoiceGross)** in the **main(String[] args)** method.

At the beginning when user calls this method, he/she receives a message to input the gross price from which he/she wants to calculate the 23% tax. There is also a message to separate decimals with a comma. 

In this method **Scanner scnB23** scans the input data from the user. Next the variable double **amountGrossCb23** retrieves the entered gross amount. Afterwards, from that amount is calculated the tax amount by **double amountVatCb23** and the net amount by double **amountNetCb23**. Eventually, this method displays: the net amount, the gross amount and the tax amount. What is more, in this method the mentioned doubles (**amountNetCb23**, **amountVatCb23**, **amountGrossCb23**) are rounded to 2 decimal places.


The whole **calculteGross23()** method is located in the **try/catch** block to protect from the user’s input mistakes (inputting data or wrong numbers). In the **catch** block there is a message for the user and the **calculteBrutto23()** method, so when he/she inputs a wrong number or data, he/she will have opportunity to enter the data again.

#### calculateGross8()

The **calculateGross8()** method runs when user chooses **case 1** in the **switch(userChoice)** and **case 2** in the **switch(userChoiceGross)** in the **main(String[] args)** method.

At the beginning when user calls this method, he/she receives a message to input the gross price from which he/she wants to calculate the 8% tax. There is also a message to separate decimals with a comma. 

In this method **Scanner scnB8** scans the input data from the user. Next the variable double **amountGrossCb8** retrieves the entered gross amount. Afterwards, from that amount is calculated the tax amount by **double amountVatCb23** and the net amount by double **amountNetCb8**. Eventually, this method displays: the net amount, the gross amount and the tax amount. What is more, in this method the mentioned doubles (**amountNetCb8**, **amountVatCb8**, **amountGrossCb8**) are rounded to 2 decimal places.

The whole **calculteGross8()** method is located in the **try/catch** block to protect from the user’s input mistakes (inputting data or wrong numbers). In the **catch** block there is a message for the user and the **calculteGross8()** method, so when he/she inputs a wrong number or data, he/she will have opportunity to enter the data again.

#### calculateBrutto5()

The **calculateGross5()** method runs when user chooses **case 1** in the **switch(userChoice)** and **case 2** in the **switch(userChoiceGross)** in the **main(String[] args)** method.

At the beginning when user calls this method, he/she receives a message to input the gross price from which he/she wants to calculate the 5% tax. There is also a message to separate decimals with a comma. 

In this method **Scanner scnB5** scans the input data from the user. Next the variable double **amountGrossCb5** retrieves the entered gross amount. Afterwards, from that amount is calculated the tax amount by **double amountVatCb5** and the net amount by double **amountNetCb5**. Eventually, this method displays: the net amount, the gross amount and the tax amount. What is more, in this method the mentioned doubles (**amountNetCb5**, **amountVatCb5**, **amountGrossCb5**) are rounded to 2 decimal places.

The whole **calculteGross5()** method is located in the **try/catch** block to protect from the user’s input mistakes (inputting data or wrong numbers). In the **catch** block there is a message for the user and the **calculteGross5()** method, so when he/she inputs a wrong number or data, he/she will have opportunity to enter the data again.



#### calculateNet23()

The **calculateNet23()** method runs when user chooses **case 2** in the **switch(userChoice)** and **case 1** in the **switch(userChoiceNet)** in the **main(String[] args)** method.

At the beginning when user calls this method, he/she receives a message to input the net price from which he/she wants to calculate the 23% tax. There is also a message to separate decimals with a comma. 

In this method **Scanner scnN23** scans the input data from the user. Next the variable **double amountNetN23** retrieves the entered net amount. Afterwards, from that amount is calculated the tax amount by **double amountVatN23** and the gross amount by double **amountGrossN23**. Eventually, this method displays: the net amount, the gross amount and the tax amount. What is more, in this method the mentioned doubles (**amountNetN23**, **amountVatN23**, **amountGrossN23** ) are rounded to 2 decimal places.

The whole **calculteNet23()** method is located in the **try/catch** block to protect from the user’s input mistakes (inputting data or wrong numbers). In the **catch** block there is a message for the user and the **calculteNet23()** method, so when he/she inputs a wrong number or data, he/she will have opportunity to enter the data again.

#### calculateNet8()

The **calculateNet8()** method runs when user chooses **case 2** in the **switch(userChoice)** and **case 2** in the **switch(userChoiceNetto)** in the **main(String[] args)** method.

At the beginning when user calls this method, he/she receives a message to input the net price from which he/she wants to calculate the 8% tax. There is also a message to separate decimals with a comma. 

In this method **Scanner scnN8** scans the input data from the user. Next the variable **double amountnetN8** retrieves the entered net amount. Afterwards, that amount is calculated the tax amount by **double amountVatN8** and the gross amount by **double amountGrossN8**. Eventually, this method displays: the net amount, the gross amount and the tax amount. What is more, in this method the mentioned doubles (**amountNetN8**, **amountVatN8**, **amountGrossN8**) are rounded to 2 decimal places.

The whole **calculteNet8()** method is located in the **try/catch** block to protect from the user’s input mistakes (inputting data or wrong numbers). In the **catch** block there is a message for the user and the **calculteNet8()** method, so when he/she inputs a wrong number or data, he/she will have opportunity to enter the data again.

#### calculateNet5()

The **calculateNet5()** method runs when user chooses **case 2** in the **switch(userChoice)** and **case 3** in the **switch(userChoiceNet)** in the **main(String[] args)** method.

At the beginning when user calls this method, he/she receives a message to input the net price from which he/she wants to calculate the 5% tax. There is also a message to separate decimals with a comma. 

In this method **Scanner scnN5** scans the input data from the user. Next the variable **double amountNetN5** retrieves the entered net amount. Afterwards, from that amount is calculated the tax amount by **double amountVat5** and the gross amount by double **amountGrossN5**. Eventually, this method displays: the net amount, the gross amount and the tax amount. What is more, in this method the mentioned doubles (**amountNetN5**, **amountVatN5**, **amountgrossN5**) are rounded to 2 decimal places.

The whole **calculteNet5()** method is located in the **try/catch** block to protect from the user’s input mistakes (inputting data or wrong numbers). In the **catch** block there is a message for the user and the **calculteNet5()** method, so when he/she inputs a wrong number or data, he/she will have opportunity to enter the data again.



## Inspiration 

The **while** loop with the **boolean shouldContinue** and the **swithch(userChoice)** is inspired by the YouTube channel „Jak nauczyć się programowania” - video „Java- podstawy w 2h”. (https://www.youtube.com/watch?v=6G19kFcVXTo).


