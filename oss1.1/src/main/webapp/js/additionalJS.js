function calcTotPos(availability) {
    var sel = parseInt($('.numeric-input').find('input').val()) + 1,
        price;

    if(sel <= availability){
        price = parseInt($('.product-price').find('.product-price-sad').text()) + parseInt($('.total-price').find('.totPrice-sad').text());
        $('.total-price').find('.totPrice-sad').text(price);
    }else {
        $('.numeric-input').find('input').val(4);
    }
}

function calcTotNeg(availability) {
    var sel = parseInt($('.numeric-input').find('input').val()) - 1,
        price;

    if(sel > 0){
        price = parseInt($('.total-price').find('.totPrice-sad').text()) - parseInt($('.product-price').find('.product-price-sad').text());
        $('.total-price').find('.totPrice-sad').text(price);
    }
}