var fib:number =10;
var num1:number =0;
var num2:number=1;
var sum:number;
for(var i:number=0;i<=fib;i++){
    sum=num1+num2;
    num1=num2;
    num2=sum;
    console.log(sum);
}