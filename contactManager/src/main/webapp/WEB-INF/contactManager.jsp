<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="/agregaCliente">
		<TABLE border="1">

			<TR>
				<TD>Nombre</TD>
				<TD><input type="text" name="nombre" size="25"></TD>
				<TD>Apellido Paterno</TD>
				<TD><input type="text" name="apellidoP" size="25"></TD>
				<TD>Apellido Materno</TD>
				<TD><input type="text" name="apellidoM" size="25"></TD>
			</TR>
			<TR>
				<TD>Dirección</TD>
				<TD colspan="3"><input type="text" name="direccion" size="25"></TD>

				<TD>Teléfono</TD>
				<TD><input type="text" name="telefono" size="25"></TD>
			</TR>

			<TR>
				<TD colspan="6" align="left">
				<button type="submit">Agregar</button>
				
			</TR>
		</TABLE>
	</form>
	<hr>

	<table border="1">
		<thead>
			<tr>
				<th>#</th>
				<th>Nombre</th>
				<th>Apellido Paterno</th>
				<th>Apellido Materno</th>
				<th>Dirección</th>
				<th>Teléfono</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="lista" items="${listado}">

				<tr>
					<td><c:out value="${listado.indexOf(lista)+1}"></c:out></td>
					<td><c:out value="${lista[0]}"></c:out></td>
					<td><c:out value="${lista[1]}"></c:out></td>
					<td><c:out value="${lista[2]}"></c:out></td>
					<td><c:out value="${lista[3]}"></c:out></td>
					<td><c:out value="${lista[4]}"></c:out></td>
				</tr>

			</c:forEach>

		</tbody>



	</table>

</body>
</html>