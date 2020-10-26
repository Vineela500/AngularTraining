import student=require("./student_interface");
class Studentimp implements student.student1{
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
var objstudent2=new Studentimp(101,"Abhay","CSE");
console.log("ID: "+objstudent2.getId());

console.log("Name: "+objstudent2.getName());

console.log("Stream: "+objstudent2.getStream());