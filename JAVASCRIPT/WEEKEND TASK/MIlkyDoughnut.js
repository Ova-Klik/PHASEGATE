function countEvenElements(numbers){

let countEven=0;
    for(let index=0; index<numbers.length;index++){
    if(numbers[index]%2==0)countEven++;
}
    return countEven;

}

module.exports={
    
    countEvenElements
    
};


