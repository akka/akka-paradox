document.addEventListener("DOMContentLoaded", function() {
    var rotator = document.getElementById('lightbendRotator');
    if(rotator){
        var index = 0;
        var rotatorItems = rotator.children;
        var rotatorItemsLength = rotatorItems.length -1;
        //turn on first item
        rotatorItems[index].classList.add('visible');
        //rotate through items
        setInterval(function(){ 
            rotatorItems[index].classList.remove('visible');
            if(index != rotatorItemsLength){index += 1;}else{index = 0;};
            rotatorItems[index].classList.add('visible');
        }, 9000);
    };
});