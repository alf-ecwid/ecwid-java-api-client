package com.ecwid.apiclient.v3.dto.variation.request

import com.ecwid.apiclient.v3.dto.product.enums.AttributeValueAlias

data class UpdatedVariation(

		val sku: String? = null,

		val options: List<Option>? = null,

		val price: Double? = null,
		val compareToPrice: Double? = null,
		val wholesalePrices: List<WholesalePrice>? = null,

		val quantity: Int? = null,
		val unlimited: Boolean? = null,
		val warningLimit: Int? = null,

		val weight: Double? = null,

		val attributes: List<AttributeValue>? = null,

		val isShippingRequired: Boolean? = null

) {

	data class AttributeValue(
			val id: Int? = null,
			val alias: AttributeValueAlias? = null,
			val value: String? = null
	)

	data class WholesalePrice(
			val quantity: Int = 0,
			val price: Double = 0.0
	)

	data class Option(
			val name: String? = null,
			val value: String? = null
	)
}

