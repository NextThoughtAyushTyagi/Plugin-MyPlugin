<div class="modal fade" id="modal-fullSizePic" role="dialog">
    <div class="modal-dialog">
        <div>
            <div class="modal-body">
                <img src="${createLink(controller: 'public', action: 'showCarPic', params: [uuid: uuid])}" height="500"
                     alt="" class="">
                <button type="button" class="close btn-primary" style="padding-right: 0px;"
                        data-dismiss="modal">close</button>
            </div>
        </div>
    </div>
</div>
<script>
    function resetUpdateValue() {
        $('#modalwindow').modal('hide');
    }
</script>


