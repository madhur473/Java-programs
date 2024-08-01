<%@page import="linkcode.model.Product"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }
    th, td {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }
    th {
        background-color: #f2f2f2;
    }
     /* CSS for the form container */
   
     .product-form {
        margin-bottom: 20px;
        margin-left: 500px;
        margin-top: 100px;        
    }
    .product-form label {
        display: inline-block;
        width: 150px;
        margin-bottom: 5px;
    }
    .product-form input[type="text"],
    .product-form input[type="number"] {
        width: 200px;
        padding: 5px;
        margin-bottom: 10px;
        border-radius: 3px;
        border: 1px solid #ccc;
    }
    .product-form input[type="submit"] {
        padding: 8px 20px;
        background-color: #4CAF50;
        align-content:center;
        color: white;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }
    .product-form input[type="submit"]:hover {
        background-color: #45a049;
    }
    
</style>
</head>
<body>

<div class="product-form">
    <form action="ProductController">
        <label for="prodId">Product Id:</label>
        <input type="text" id="prodId" name="prodId"><br>
        <label for="pName">Product Name:</label>
        <input type="text" id="pName" name="pName"><br>
        <label for="prodQty">Product Qty:</label>
        <input type="number" id="prodQty" name="prodQty"><br>
        <label for="prodPrice">Product Price:</label>
        <input type="text" id="prodPrice" name="prodPrice"><br>
        <input type="submit" value="Add Product">
    </form>
</div>

<%
    List<Product> lstproduct=null;
    if(!session.isNew()) {
        lstproduct=(List<Product>)session.getAttribute("Product");
        if(lstproduct != null && !lstproduct.isEmpty()) {
%>
            <table>
                <tr>
                    <th>Product Id</th>
                    <th>Product Name</th>
                    <th>Product Qty</th>
                    <th>Product Price</th>
                </tr>
<%
            for(Product p : lstproduct) {
%>
                <tr>
                    <td><%= p.getProdId() %></td>
                    <td><%= p.getpName() %></td>
                    <td><%= p.getProdQty() %></td>
                    <td><%= p.getProdPrice() %></td>
                </tr>
<%
            }
%>
            </table>
<%
        } else {
            out.println("No products available.");
        }
    }
    session.invalidate();
%>

</body>
</html>
