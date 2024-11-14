// function outer (){
//     let a=100;
//     function inner (){
//         console.log(a);

//     }
//     return inner;
// }
// let out=outer();
// out();

function counter(){
    let count=0;
    return{
        getcount: function(){
            console.log(count);
        },
        increment: function(){
            count++;
        },
        decrement: function(){
            count--;
        },
        reset: function(){
            count=0;
        }


    } 


}

let count1=counter();
count1.getcount;
