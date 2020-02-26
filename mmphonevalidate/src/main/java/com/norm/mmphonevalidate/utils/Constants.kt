package com.norm.mmphonevalidate.utils

/**
 * Prefix number (eg. +959 or 09).
 */
const val PREFIX = "(^\\+(?:95)|0)9"

/**
 * Prebuilt pattern for MPT.
 */
const val PATTERN_MPT = "$PREFIX((?<three>884|885|886|267|268|269|405|406|407|408|409|446|266|447|887|888|889)\\d{6}|(?<two>89|42)\\d{7})\$"

/**
 * Prebuilt pattern for TELENOR.
 */
const val PATTERN_TELENOR = "$PREFIX((?<three>753|754|755|756|757|758|759|750|751|752)\\d{6}|(?<two>76|77|78|79)\\d{7})\$"

/**
 * Prebuilt pattern for MYTEL.
 */
const val PATTERN_MYTEL = "$PREFIX((?<three>663|664|665|666|660|661|662)\\d{6}|(?<two>69|68|67)\\d{7})\$"

/**
 * Prebuilt pattern for OOREDOO.
 */
const val PATTERN_OOREDOO = "$PREFIX(?<two>95|96|97|98)\\d{7}\$"

/**
 * Prebuilt pattern for MEC.
 */
const val PATTERN_MEC = "$PREFIX(?<three>340|346|349)\\d{6}\$"

const val LOGO_MPT = "https://upload.wikimedia.org/wikipedia/en/9/96/Logo_of_MPT.svg"
const val LOGO_TELENOR = "https://upload.wikimedia.org/wikipedia/commons/9/9e/Telenor_Logo.svg"
const val LOGO_MYTEL = "https://mytel.com.mm/themes/vmy/images/logo3.png"
const val LOGO_OOREDOO = "https://upload.wikimedia.org/wikipedia/commons/0/0c/Ooredoo_Myanmar_Logo.png"
const val LOGO_MEC = ""