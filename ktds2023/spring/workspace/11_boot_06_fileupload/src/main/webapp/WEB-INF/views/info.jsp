<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>업로드정보</h2>
comment:${uploadDTO.theText}<br>
size:${uploadDTO.theFile.size}<br>
contentType:${uploadDTO.theFile.contentType}<br>
originalFilename:${uploadDTO.theFile.originalFilename}<br>
</body>
</html>