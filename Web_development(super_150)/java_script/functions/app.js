function tanishq_ka_diwala(){
    console.log("tanishq ka diwala ho gya")
}
tanishq_ka_diwala();
tanishq_ka_diwala();
function sum(){
    let a=10;
    let b=50;
    console.log(a+b)
}
sum();
function sum2(a,b){//parameterised functions
    console.log(a+b);
}
sum2(10,11);
function tanishqnalla(a,b=60){//defined parameterised function.
    console.log(typeof(a+b));
    console.log(a+b);

}
tanishqnalla(10);//NaN-not a number output milega

function tanishqnalle(a=60,b=10){//jab default aur arguement value hoti h to arguement value prefer kri jaati h
    console.log(a+b);

}
tanishqnalle(10);
function sam(a){
    let kaju;
    console.log(typeof(kaju));//undefine datatype
    console.log(a+kaju);//NaN error
}
sam(10);
//undefined primitive is given by js engine
//null  primitive is given by coders
let almond;//right option
let almonds=undefined;//wrong option
let cashew=null;
console.log(cashew);
console.log(typeof(cashew));//type of null is always object...
