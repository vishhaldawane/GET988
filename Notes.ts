/*
1. install node js
2. install angular
3. create your first anuglar app
        ng new MyFirstApp
                    |
        --------------------------
        |            |
        node_modules src
                     |
            ------------------
            |           |
            app     index.html
            |
-----------------------------------
|                  |           |
app.component.html | app.component.ts
        app.component.css

4. open vs code
        a. open the folder -> MyFirstApp

5. start the terminal
        a. ng serve
6. start the browser
        a. hit the below url
                http://localhost:4200

Modules in Angular
--------------------

similar to packages in java
 - to organize the classes/components/services


                       app
                        |
        -------------------------------------------------------------------------------
        |                       |                       |                       |
    account <--module           payee <-module       transfer <-- module        calculation <-- module
    |                           |                       |                       |
SavingsAccountComponent   AddPayeeComponent     FundTransferComponent           MyCalculation <-- my-calculation.service.ts
[html + css + ts]         [ html + css + ts ]   [ html + css + ts ]               ts    calculateCompoundInterest() {}
CurrentAccountComponent   ViewPayeeComponent                                            calculateCurrencyRate() {}
FixedAccountComponent     DeletePayeeComponent                                          calculateSimpleInterest() {}
Savings.ts Current.ts
Fixed.ts

1. ng g m account               [ same way make payee and transfer too ]
2. ng g c account/SavingsAccount THEN ng g c account/FixedAccount
   ng g c account/CurrentAccount
3. edit account.module.ts <-- add following line
        exports: [ SavingsAccountComponent ] <-- inside @NgModule decorator after declarations
4. edit app.module.ts <- add following line
        imports: [
        BrowserModule,FormsModule, AppRoutingModule, AccountModule <--- this line to be added
        ]    
        
        

        Services
1. create a module
        ng g m food
2. create required services
        ng g s food/Lunch
                - add function here
                lunch.service.ts
                feelingHungryLetsHaveLunch() {
                 alert('after this will take break for lunch..');
                } 
        ng g s food/Dinner
                - add function here
3. import the FoodModule in app.module.ts
4. open app.component.ts
        constructor(private ls: LunchService ) { }
  runMe() {
    this.ls.feelingHungryLetsHaveLunch();
  }
  5. open app.component.html
  <button (click)="runMe()"> Have Food </button>


1. ng g m currency
                        (1)currency <= module
                        |
                ----------------------------------------------------
                |                   |    |                       |CurrencyConverterService(3)
                | (2)               |    |                       |  |
2. ng g c CurrencyConverterComponent| (1)currency.module.ts currency-converter.service.ts <=service
                        |      Currency.ts (4)                      | (3)
        ---------------------------------------------      convert(curr:Currency) (3)
        | (2)                   |        | (2)                     |      
currency-conveter.component.ts  | currency-converter.component.css |
     |           currency-converter.component.html (2)             |
     Currency's       sendForConversion() -------------------------+   
     object is           | ccs.convert();     
     |                   |                                     
theCurrency <--------used by this html
   |
   constructor(ccs: CurrencyConverterService){}

  3. ng g s currency/CurrencyConverter

  4. create a ts file by clicking on currency  folder 
     -> new file -> Currency.ts
  5. a.make an object of Currency class as theCurrency;   
     b.make a constructor to initialilze the service
        constructor(private ccs: CurrencyConverterService) { }
     c.make a sendForConversion() function 
                in -> currency-conveter.component.ts
     d. invoke the convert() method via ccs based on UI click
     
  5. design the UI inside currency-converter.component.html
*/