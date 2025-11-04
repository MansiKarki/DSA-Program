// console.log("mansiiiiii");
// let num =20;
// if(num % 10 == 0){
//     console.log("good");
// }
// else{
//     console.log("bad");
// }

// let namme = 'mansi';
// let age = 23 ;
//  alert('${namme} is ${age} years old');

//---------------------------------------------------odd num
//  console.log("odd numbers");
// for(let i=1; i<=15; i++)
//     {
//     if(i%2==1)
//         {
//         console.log(i);
//         }
//     }

// --------------------------------------------------even numbers    
// console.log("even numbers");
// for(let n=1; n<=15; n++)
//     {
//     if(n%2==0)
//         {
//         console.log(n);
//         }
//     }

//--------------------------------------------------- multiplication table of 5
// console.log("table of 5");
// for(let i=1; i<=10; i++)
// {
//     console.log(i*5);
// }

//------------------------------------------------Nested loop

// for(let i=1; i<=3; i++)
// {
//  console.log("Outter loop: " + i);
//  for(let j=1; j<=5; j++)
//  {
//     console.log(j);
//  }
// }

//-------------------------------------------------Project - Guess the movie

// let fav="Interstellar"
// let guess=prompt("guess the movie (Hint : reated by Black hole and space travel) or type 'quit' to exit");
// while((guess!=fav) && (guess!="quit"))
// {
    // guess = prompt("wrong guess. Please Try again");
// }
// if(guess==fav)
//     console.log("you guessed it right");
// else
//     console.log("you quit the game");
 


//----------------------------------------------------------------Loop with array
// let fruit = ["apple", "banana", "mango", "grapes"];
// for(let i=0; i<fruit.length; i++)
// {
//     console.log(fruit[i]);
// }

//---------------------------------------------------------------for of loop
// let car=["audi", "bmw", "mercedes", "ferrari"];
// for(let c of car)
// {
//     console.log(c)
// }

//--------------------------------------------------------------for of loop with string
// let nae="mansi";
// for(let n of nae)
// {
//     console.log(n);
// }

//--------------------------------------------------------------nested for of loop
//  let Alpha =[ ["a", "b", "c"],["d","e","f"] ];
//  for (let arr of Alpha)
//  {
//     for(let a of arr)
//     {
//         console.log(a);
//     }
//  }


//---------------------------------------------------------------objects
//  let stude={
//     name: "mansi",
//     age: 23,
//     city: "surat"
//  };


//-------------------------------------------------------------object 2
// const post ={
//      username:"mansikk23",
//      content: "Surronundings are beautiful",
//      like: 100,
//      repost:20 
// }


//------------------------------------------------------------variable name with keyword
// const obj={
//     null:"mansi",
//     undefined:23
// }

//----------------------------------------------------------Multiple objects
// const classinfo={
//     mansi :{
//         grade:"A"
//     },
//     dipendra :{
//         grade:"B"
//     },
//        ram :{
//         grade:"C"
//     },
// };
// let fruit = ["apple", "banana", "mango", "grapes","CHIKOO","papaya"];
// for(let i=0; i<fruit.length; i++)
// {
//     console.log(fruit[i]);
// }


//method 1
function abc(){
    console.log("hello");
}
abc();

//method 2
let abcd=function(){
    console.log("hi");
}
abcd();

//method 3
function dance(style){
    console.log("dancing "+ style);
}
dance("classical");


//method 4
function add(n1,n2){
    
    console.log(n1+n2);
}
add(5,10);

//method 5

function add(v1=1,v2= 3){
    console.log(v1,v2);
}
add()

//method 6
function abcdd(...val){
    console.log(val);
}
abcdd(1,2,3,4,5);

//method 7

function abcde(){
    return "mansi";
}

let value= abcde();
console.log(value);

//method 8
function multiply(n1,n2){
    return n1*n2;
}



// method 8
let a=12
function test(){
    console.log("heyyy");
}

function demo(){
  a++;
}


//method 9
function abccd(){
    let a=12;
    return function()
    {
        comsole.log(a);
    }
}

// abccd()();

// (function(){
//     console.log("IIFE function");
// })();


function f()
{
    return;
}

console.log(f())


IIFE
(function() {
  console.log("This is an IIFE (Immediately Invoked Function Expression)");
})();


// BMI CALCULATOR

function calculateBMI(weight, height) {
    return weight / (height * height );
}
console.log(calculateBMI(70, 1.75).toFixed(3)); // Example usage

//Array
