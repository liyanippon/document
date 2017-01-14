<?xml version="1.0" encoding="gb2312"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	version="1.0">
	<!-- default-space="default" -->
	<xsl:template match="/">
		<HTML>
			<link href="main.css" rel="stylesheet" type="text/css">
				<body>
					<xsl:comment>ע�Ͳ���</xsl:comment>
					<xsl:element name="title">
						<xsl:value-of select="MyInfo" />
					</xsl:element>
					<table style="WIDTH: 750px;" cellSpacing="2"
						cellPadding="2" border="0">
						<tr class="listtitleborder">
							<th>����</th>
							<th>����</th>
						</tr>
						<xsl:for-each select="MyInfo">

							<tr class="caldate">
								<th>
									<xsl:value-of select="����" />
								</th>
								<th>
									<xsl:apply-templates />
									<!-- 	<xsl:value-of select="����" /> -->
								</th>
							</tr>
						</xsl:for-each>
						<xsl:for-each select="MyInfo/��������">
							<tr>
								<th>
									<xsl:value-of select="��˾" />
								</th>
								<th>
									<xsl:value-of select="����"></xsl:value-of>
								</th>
								<th>
									<xsl:element name="email"></xsl:element>
								</th>
							</tr>
						</xsl:for-each>

						<tr>
							<th>
								<xsl:for-each select="MyInfo/��������">
									<xsl:element name="A">
										<xsl:attribute name="href">
											<xsl:value-of select="����" />
										</xsl:attribute>
										<xsl:value-of select="��˾" />
										<xsl:value-of select="@Ӣ����" />
									</xsl:element>
								</xsl:for-each>
							</th>
							<th>222222222</th>
						</tr>
					</table>





				</body>
			</link>
		</HTML>
	</xsl:template>

</xsl:stylesheet>