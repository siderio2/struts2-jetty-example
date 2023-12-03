<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

    <h1>Resumen de factura: </h1>

    <table>
      <tr>
        <td class="evenRow">
          <s:text name="form.subject.message"/>
          <s:property value="invoiceBean.subject"/>
        </td>
      </tr>
      <tr>
        <td class="evenRow">
          <s:text name="form.fromDate.message"/>
          <s:property value="invoiceBean.dateFrom"/>
        </td>
      </tr>
      <tr>
        <td class="evenRow">
          <s:text name="form.toDate.message"/>
          <s:property value="invoiceBean.dateTo"/>
        </td>
      </tr>
      <tr>
        <td class="evenRow">
          <s:text name="wellcome.total.message"/>
          <s:property value="invoiceBean.getTotal()"/>
        </td>
      </tr>
    </table>



</body>
</html>