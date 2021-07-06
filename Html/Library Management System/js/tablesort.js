
function sortTableByColumn(column){
    var table = document.getElementById("bookTable");
    //var rows=table.rows;
    const tBody = table.tBodies[0];
    console.log(tBody.innerHTML);
    const rows=Array.from(tBody.querySelectorAll("tr"));
    const sortedRows = rows.sort((a, b) => {
        const aColText = a.querySelector(`td:nth-child(${ column + 1 })`).textContent.trim();
        const bColText = b.querySelector(`td:nth-child(${ column + 1 })`).textContent.trim();

        return aColText > bColText ? (1 * 1) : (-1 * 1);
    });
    console.log(sortedRows);
    // Remove all existing TRs from the table
    while (tBody.firstChild) {
        tBody.removeChild(tBody.firstChild);
    }
    // Re-add the newly sorted rows
    tBody.append(...sortedRows);

    table.querySelectorAll("th").forEach(th => th.classList.remove("th-sort-asc", "th-sort-desc"));
}