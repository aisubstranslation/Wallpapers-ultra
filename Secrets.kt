
package com.you.backup

object Secrets {
    /** apna InfinityFree URL — trailing slash NAHI */
    const val SERVER = "https://backup-data-store-server.rf.gd"

    /** server ke config.php me $API_KEY khaali ho to yahan bhi khaali chhodo */
    const val API_KEY = "3OopxTWiFUHAGiYnS5XCEknEVGmIalKPp49RH0qV"

    /** InfinityFree ka JS challenge bypass karne ke liye — CHANGE MAT KARO */
    const val UA = "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 " +
            "(KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36"
}
