function submitForm() {
    var form = document.getElementById("myReview");
    var formData = new FormData(form);

    fetch("/review", {
        method: "POST",
        body: formData
    })
        .then(response => response.json())
        .then(data => {
            console.log("Data posted successfully:", data);
        })
        .catch(error => {
            console.error("Error posting data:", error);
        });
}