export class BankAccount {
    accountNumber: number;
    accountHolder: string;
    accountBalance: number;
    isActive: boolean;
    image: string;
    address : Address = new Address();

    constructor() {
        this.accountNumber=10;
        this.accountHolder="Jack";
        this.accountBalance=5000;
        this.isActive=true;
        this.image = '';
    }
}

class Address {
    area: string='';
    street: string='';
    city: string='';
    state: string='';
    country: string='';
    pin : string=''; 
}