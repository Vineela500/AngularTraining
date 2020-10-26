interface Banking{
    data(acct_no:number, name:string, balance:number) : void;
    getId():number;
    getName():string;
    getBalance():number
}
class Bank implements Banking{ 
    private accno:number;
    private name:string;
    private balance:number;
    data(acct_no:number, name:string, balance:number) : void
  {
     this.accno= acct_no;
	 this.name = name;
	 this.balance= balance;
  }

    getId():number{
        return this.accno;
    }
    getName():string{
        return this.name;
    }
    getBalance():number{
        return this.balance;
    }
}
var objbank=new Bank();
objbank.data(100000333444,"Abhay",1000000);
console.log("ID: "+objbank.getId());

console.log("Name: "+objbank.getName());

console.log("Balance: "+objbank.getBalance());
