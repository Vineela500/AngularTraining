var count:number=0;
function prime(n:number):void{
  for(var i:number =2; i<n;i++){
      if(n%i==0){
          return;
      }
  }
  console.log(n);
  count++;

}
console.log(2);
for(var i:number=3;count<10;i++){
    prime(i);
}