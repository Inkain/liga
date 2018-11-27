package inkant1990.com.data.entity.teamProfile

import com.google.gson.annotations.SerializedName

data class JerseysItem(

    @field:SerializedName("stripes")
    val stripes: Boolean? = null,

    @field:SerializedName("number")
    val number: String? = null,

    @field:SerializedName("stripes_color")
    val stripesColor: String? = null,

    @field:SerializedName("split")
    val split: Boolean? = null,

    @field:SerializedName("shirt_type")
    val shirtType: String? = null,

    @field:SerializedName("horizontal_stripes")
    val horizontalStripes: Boolean? = null,

    @field:SerializedName("sleeve_detail")
    val sleeveDetail: String? = null,

    @field:SerializedName("sleeve")
    val sleeve: String? = null,

    @field:SerializedName("squares")
    val squares: Boolean? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("base")
    val base: String? = null
)