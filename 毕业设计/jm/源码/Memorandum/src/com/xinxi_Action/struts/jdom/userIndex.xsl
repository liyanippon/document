<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="ListView">
		<table border="0" cellpadding="0" cellspacing="0" width="100%"
			height="100%" class="Grid">

			<xsl:apply-templates select="Columns" />

			<xsl:apply-templates select="Items">
				<xsl:sort select='@SortOrder' order='ascending'
					data-type='number' />
			</xsl:apply-templates>

			<TFoot>
				<tr>
					<xsl:for-each select="Columns/ColumnHeader">
						<td>
							<img src="images/space.gif" />
						</td>
					</xsl:for-each>
					<td></td>
				</tr>
			</TFoot>
		</table>
	</xsl:template>

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<xsl:template match="Columns">

		<xsl:for-each select="ColumnHeader">
			<xsl:sort select="@SortOrder" />
			<col>
				<xsl:if test="position() = 1">
					<xsl:attribute name="class">
						GridColSelected
					</xsl:attribute>
				</xsl:if>
				<xsl:if test="@TextAlign">
					<xsl:attribute name="align">
						<xsl:value-of select="@TextAlign" />
					</xsl:attribute>
				</xsl:if>
				<xsl:if test="@Width">
					<xsl:attribute name="width">
						<xsl:value-of select="@Width" />
					</xsl:attribute>
				</xsl:if>
			</col>
		</xsl:for-each>
		<col />
		<THead>
			<tr height="16">
				<xsl:for-each select="ColumnHeader">
					<xsl:sort select="@SortOrder" />

					<td class="GridHeader">
						<div class="GridHeaderPanel">
							<xsl:value-of select="." />
							<font class="SortBit"></font>
						</div>
					</td>
				</xsl:for-each>
				<td class="GridHeader">
					<div class="GridHeaderPanel">
						<img src="images/space.gif" />
					</div>
				</td>
			</tr>
		</THead>
	</xsl:template>

	<xsl:template match="Items">
		<TBody>
			<xsl:apply-templates select="ListViewItem">
				<xsl:sort select='@SortOrder' order='ascending'
					data-type='number' />
				<xsl:sort select='@DateTime' order='ascending' />
			</xsl:apply-templates>
		</TBody>
	</xsl:template>

	<xsl:template match="ListViewItem">
		<tr height="17">
			<xsl:for-each select="Text">
				<xsl:sort select="@SortOrder" />
				<td class="ListViewItem">
					<nobr>
						<xsl:if test="position() = 1">
							<xsl:attribute name="valign">
								bottom
							</xsl:attribute>
							<img width="16" height="16" border="0"
								align="absmiddle" hspace="2">
								<xsl:attribute name="src">
									icons/16x16/
									<xsl:value-of select="../@Icon" />
								</xsl:attribute>
							</img>
						</xsl:if>
						<xsl:value-of select="." />
						<img src="images/space.gif" />
					</nobr>
				</td>
			</xsl:for-each>
			<td class="ListViewItem">
				<img src="images/space.gif" />
			</td>
		</tr>
	</xsl:template>

</xsl:stylesheet>
