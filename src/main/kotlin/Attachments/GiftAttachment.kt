package Attachments

import Attachment

data class GiftAttachment(override val type: String = "gift", val gift: Gift) : Attachment

data class Gift (
    val id: Int = 1243,
    val thumb256: String = "thumb256",
    val thumb96: String = "thumb96",
    val thumb48: String = "thumb48",
)
