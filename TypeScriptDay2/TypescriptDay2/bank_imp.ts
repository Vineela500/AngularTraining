import bank=require("./bank_interface");
import student=require("./student_interface");

class bankimp implements bank.bank1{
    private accno:number;
    private name:string;
    private balance:number;

    assign(accno:number,name:string,balance:number){
        this.accno=accno;
        this.name=name;
        this.balance=balance;
    }
    display():void{
        console.log("ID: "+this.accno);

console.log("Name: "+this.name);

console.log("Balance: "+this.balance);
    }

}
var bankobj=new bankimp();
bankobj.assign(1233000,"Siddhu",200000);
bankobj.display();
