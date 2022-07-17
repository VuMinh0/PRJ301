$(document).ready(function () {
    var form = $('#dateFilterForm');
    var dpYear = $('#ctl00_mainContent_drpYear').find(':selected').val();
    var dpWeek = $('#ctl00_mainContent_drpSelectWeek').find(':selected').val();

    $('#ctl00_mainContent_drpYear').on('change', function () {
        dpYear = $(this).find(':selected').val();
        $('#ctl00_mainContent_drpSelectWeek').val($('#ctl00_mainContent_drpSelectWeek option:first').val()); // Auto select first week if change year
        dpWeek = 1;
        handleFilterDateSubmit();
    });

    $('#ctl00_mainContent_drpSelectWeek').on('change', function () {
        dpWeek = $(this).find(':selected').val();
        handleFilterDateSubmit();
    });

    function handleFilterDateSubmit() {
        $('#dateFilterForm').submit();
    }

    $('tbody td').each(function () {
        if ($(this).find('div.cell').length === 0) {
//             If not, set text to -
            $(this).text('-');
        }
    });
});