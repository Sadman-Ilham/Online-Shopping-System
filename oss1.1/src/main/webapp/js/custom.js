$(document).ready(function() {
    $("#percentage-text").prop("disabled", true); // Disable percentage-textbox
    // Category hover
    $('.sidebar-box-content').children('ul').children('li').mouseover(function() {
        var index = $(this).index(); // Which sub category is hovered
        var sub = -39 - (index * 36);
        $(this).find('.sub-cate-main').css("top", sub + "px");
        $(this).find('.sub-cate-main').show();
    }).mouseout(function() {
        $(this).find('.sub-cate-main').hide();
    });
    /* Rating */
    // Read Only
    $('.rating.readonly-rating').raty({
        readOnly: true,
        path: 'images/rating',
        score: function() {
            return $(this).attr('data-score');
        }
    });
    $('.rating.medal.readonly-rating').raty({
        readOnly: true,
        path: 'images/rating',
        starOn: 'medal-on.png',
        starOff: 'medal-off.png',
        score: function() {
            return $(this).attr('data-score');
        }
    });
    // Product Rate
    $('.rating.product-rate').raty({
        path: 'images/rating',
        score: function() {
            return $(this).attr('data-score');
        }
    });
    // Shop Rate
    $('.rating.shop-rate').raty({
        path: 'images/rating',
        starOn: 'medal-on.png',
        starOff: 'medal-off.png',
        score: function() {
            return $(this).attr('data-score');
        }
    });
    $('.js-example-basic-single').select2({
        placeholder: "Select a category",
        allowClear: true
    });
    $('#onsale-checkbox').change(function() {
        var percentagetext = $("#percentage-text");
        // console.log('your message');
        if ($(this).is(":checked")) {
            //'checked' event code
            // console.log('check');
            $("#percentage-text").prop("disabled", false);
            return;
        }
        //'unchecked' event code
        // console.log('uncheck');
        $("#percentage-text").prop("disabled", true);
    });
});