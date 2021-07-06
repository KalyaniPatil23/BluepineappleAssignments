
function sortTableByColumn(column){
    var table = document.getElementById("bookTable");

// display value property of select list (from selected option)
console.log( `${column + 1}` );
    //var rows=table.rows;
    const tBody = table.tBodies[0];
    console.log(tBody.innerHTML);
    const rows=Array.from(tBody.querySelectorAll("tr"));
    console.log(tBody.querySelectorAll("tr").innerHTML);
    const sortedRows = rows.sort((a, b) => {
        console.log(a.querySelector(`td:nth-child(2)`));
        const aColText = a.querySelector(`td:nth-child(${ column + 1 })`).textContent.trim();
        console.log(aColText);
        const bColText = b.querySelector(`td:nth-child(${ column + 1 })`).textContent.trim();
        console.log(bColText);

        return aColText > bColText ? 1 : -1 ;
    });
    console.log(sortedRows.values);
    // Remove all existing TRs from the table
    while (tBody.firstChild) {
        tBody.removeChild(tBody.firstChild);
    }
    // Re-add the newly sorted rows
    tBody.append(...sortedRows);

    //table.querySelectorAll("th").forEach(th => th.classList.remove("th-sort-asc", "th-sort-desc"));
}