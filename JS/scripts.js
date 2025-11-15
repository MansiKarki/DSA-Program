
// this keyword in JavaScript
const stu = {
    name: "Alice",
    age: 21,
    city: "New York",
    math :23,
    english: 45,
    science: 67 ,
    getAvg() {
        let avg = (this.math + this.english + this.science) / 3;
        console.log("Average marks: " + avg);
        console.log(`${this.name} got avg marks =${avg}`)
    }
}




// Try - catch Block ij JavaScript
console.log("mansiii");
console.log("mansiii");
console.log("mansiii");
let a =10;
try{
    console.log(a)
}
catch{
    console.log("error a is not defined")
}
console.log("heyyyy");
console.log("mansiii");
console.log("here");


 const calculateSum = (a, b) => {
            let result = a + b;
            return result;
        };



//Arrow function 
const cube= (n)=>{
    return n *n *n;

}

const pow = (a, b) =>{
    return a ** b;

}


//arrow function implicit

const multiply = (x, y) => x * y;
const cue= (n)=> n*n*n

//Timeout  settimeout


console.log("hii here");

setTimeout(() => {
    console.log("This message is shown after 3 seconds");
}, 3000);

console.log("hii here 2");


//setinterval



setInterval(() => {
    console.log("This message is shown after 3 seconds");
}, 2000);



//

