interface Student{
    getId():number;
    getName():string;
    getStream():string;


}
class Student1{
    private id:number;
    private name:string;
    private stream:string;
    constructor(id:number,name:string,stream:string){
        this.id=id;
        this.name=name;
        this.stream=stream;
    }
    getId():number{
        return this.id;
    }
    getName():string{
        return this.name;
    }
    getStream():string{
        return this.stream;
    }
}
var objstudent1=new Student1(101,"Abhay","CSE");
console.log("ID: "+objstudent1.getId());

console.log("Name: "+objstudent1.getName());

console.log("Stream: "+objstudent1.getStream());