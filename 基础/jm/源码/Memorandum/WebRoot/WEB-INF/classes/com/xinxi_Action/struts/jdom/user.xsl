<?xml version="1.0" encoding="gb2312"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	version="1.0">
	<!-- default-space="default" -->
	<xsl:template match="/">
		<HTML>
			<link href="main.css" rel="stylesheet" type="text/css">
				<body>
					<xsl:comment>注释测试</xsl:comment>
					<xsl:element name="title">
						<xsl:value-of select="MyInfo" />
					</xsl:element>
					<table style="WIDTH: 750px;" cellSpacing="2"
						cellPadding="2" border="0">
						<tr class="listtitleborder">
							<th>姓名</th>
							<th>年龄</th>
						</tr>
						<xsl:for-each select="MyInfo">

							<tr class="caldate">
								<th>
									<xsl:value-of select="姓名" />
								</th>
								<th>
									<xsl:apply-templates />
									<!-- 	<xsl:value-of select="年龄" /> -->
								</th>
							</tr>
						</xsl:for-each>
						<xsl:for-each select="MyInfo/工作经验">
							<tr>
								<th>
									<xsl:value-of select="公司" />
								</th>
								<th>
									<xsl:value-of select="部门"></xsl:value-of>
								</th>
								<th>
									<xsl:element name="email"></xsl:element>
								</th>
							</tr>
						</xsl:for-each>

						<tr>
							<th>
								<xsl:for-each select="MyInfo/工作经验">
									<xsl:element name="A">
										<xsl:attribute name="href">
											<xsl:value-of select="部门" />
										</xsl:attribute>
										<xsl:value-of select="公司" />
										<xsl:value-of select="@英文名" />
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