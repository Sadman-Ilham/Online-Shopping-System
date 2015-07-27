$(document).ready(function() {
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
    // Rate
    $('.rating.rate').raty({
        path: 'images/rating',
        score: function() {
            return $(this).attr('data-score');
        }
    });
});