@file:JvmName("MockResponses")
package com.github.droibit.simpleretrofitservice.net

/**
 *
 *
 * @author kumagai
 */

// 3 events
internal const val mockMultiEventResponse = """
{"results_returned": 3, "events": [{"event_url": "http://digiporo.connpass.com/event/24503/", "event_type": "participation", "owner_nickname": "nasa9084", "series": {"url": "http://digiporo.connpass.com/", "id": 1383, "title": "\u3067\u3058\u307d\u308d"}, "updated_at": "2016-01-15T01:00:04+09:00", "lat": "43.064386400000", "started_at": "2016-01-15T18:00:00+09:00", "hash_tag": "digiporo", "title": "\u3067\u3058\u307d\u308d #3", "event_id": 24503, "lon": "141.363206900000", "waiting": 0, "limit": 24, "owner_id": 50460, "owner_display_name": "nasa9084", "description": "<h2>\u3067\u3058\u307d\u308d #3</h2>\n<p>\u5185\u5bb9\u306f\u672a\u5b9a\u3067\u3059\u3002\u6c7a\u5b9a\u6b21\u7b2c\u968f\u6642\u66f4\u65b0\u3057\u307e\u3059\u3002\u307e\u305f\u3001LT\u3082\u52df\u96c6\u3057\u307e\u3059\u3002\u5185\u5bb9\u306f\u5927\u96d1\u628a\u306bIT\u7cfb\u3063\u307d\u3044\u3053\u3068\u306a\u3089\u4f55\u3067\u3082OK\u3067\u3059\uff01\u6642\u9593\u30fb\u5185\u5bb9\u3054\u76f8\u8ac7\u304f\u3060\u3055\u3044\u3002</p>\n<p>\u7d42\u4e86\u6642\u9593\u306f\u66ab\u5b9a\u3067\u3059\u3002\u591a\u5206\u3060\u3044\u3076\u65e9\u304f\u7d42\u308f\u308a\u307e\u3059\u3002</p>\n<h3>What's \u3067\u3058\u307d\u308d\uff1a\u300c\u3067\u3058\u307d\u308d\u300d\u306f\u3001\u300c\u306a\u3093\u3067\u3082\u3084\u308bIT\u52c9\u5f37\u4f1a\u300d\u3067\u3059\u3002</h3>\n<p>\u30b3\u30f3\u30d4\u30e5\u30fc\u30bf\u3084\u30b9\u30de\u30fc\u30c8\u30d5\u30a9\u30f3\u3001OS\u3001\u30d7\u30ed\u30b0\u30e9\u30df\u30f3\u30b0\u3001\u30cd\u30c3\u30c8\u30ef\u30fc\u30af\u3001\u30bb\u30ad\u30e5\u30ea\u30c6\u30a3\u3001IoT(Internet of Things:\u30e2\u30ce\u306e\u30a4\u30f3\u30bf\u30fc\u30cd\u30c3\u30c8)\u306a\u3069\u306e\u6280\u8853\u306e\u57fa\u790e\u3092<strong>\u697d\u3057\u304f</strong>\u5b66\u3076\u52c9\u5f37\u4f1a\u3067\u3059\u3002</p>\n<ul>\n<li>\u300cIT\u6280\u8853\u306b\u8208\u5473\u306f\u3042\u308b\u3051\u3069\u3001\u5317\u6d77\u9053\u306e\u52c9\u5f37\u4f1a\u3063\u3066\u3088\u304f\u308f\u304b\u3093\u306a\u3044\u3057\u6577\u5c45\u304c\u9ad8\u3044\u300d\u3068\u611f\u3058\u3066\u308b\u65b9\u3084\u3001</li>\n<li>\u300cLinux\u306b\u306f\u89e6\u3063\u305f\u3053\u3068\u304c\u3042\u308b\u3051\u3069\u3001\u6b66\u5668\u306b\u3067\u304d\u308b\u8a00\u8a9e\u304c\u307e\u3060\u306a\u3044\u300d\u65b9\u3084\u3001</li>\n<li>\u300cLinux\u3092\u89e6\u3063\u305f\u3053\u3068\u304c\u306a\u3044\u3051\u3069\u3001\u8208\u5473\u304c\u3042\u308b\u300d</li>\n</ul>\n<p>\u3068\u3044\u3063\u305f\u30ec\u30d9\u30eb\u306e\u65b9\u306b\u7167\u6e96\u3092\u5408\u308f\u305b\u3066\u884c\u3044\u307e\u3059\u3002\n\u5b66\u751f\u3082\u793e\u4f1a\u4eba\u306e\u65b9\u3082\u6b53\u8fce\u3067\u3059\u3002</p>\n<p>\u8b1b\u7fa9\u3084\u6f14\u7fd2\u3092\u901a\u3058\u3066\u3001\u30b9\u30bf\u30c3\u30d5\u3068\u4e00\u7dd2\u306b\u52c9\u5f37\u3057\u307e\u3057\u3087\u3046</p>\n<h3>\u304a\u3060\u3044\u3082\u304f\u3000\uff08\u968f\u6642\u66f4\u65b0\u3057\u307e\u3059\uff09</h3>\n<table>\n<thead>\n<tr>\n<th align=\"center\">\u30c6\u30fc\u30de</th>\n<th align=\"center\">\u767a\u8868\u8005</th>\n<th align=\"center\">\u5185\u5bb9</th>\n<th align=\"center\">\u6f14\u7fd2</th>\n</tr>\n</thead>\n<tbody>\n<tr>\n<td align=\"center\">Intro</td>\n<td align=\"center\">nasa9084</td>\n<td align=\"center\">\u3054\u6328\u62f6</td>\n<td align=\"center\"></td>\n</tr>\n<tr>\n<td align=\"center\">editor</td>\n<td align=\"center\">nasa9084</td>\n<td align=\"center\">\u30a8\u30c7\u30a3\u30bf\u6226\u4e89\u306e\u304a\u8a71</td>\n<td align=\"center\">\u306a\u3057</td>\n</tr>\n<tr>\n<td align=\"center\">LT</td>\n<td align=\"center\">@manzyun</td>\n<td align=\"center\">\u5973\u5b50\u9ad8\u751f\u306b\u534a\u3070\u5f37\u5236\u7684\u306bPython\u3092\u6559\u3048\u3066\u601d\u3063\u305f\u3053\u3068\u3092\u3064\u3089\u3064\u3089</td>\n<td align=\"center\"></td>\n</tr>\n<tr>\n<td align=\"center\">(\u4f11\u61a9)</td>\n<td align=\"center\"></td>\n<td align=\"center\">---\u304a\u3084\u3064\u4f11\u61a9---</td>\n<td align=\"center\"></td>\n</tr>\n<tr>\n<td align=\"center\">Network</td>\n<td align=\"center\">nasa9084</td>\n<td align=\"center\">HTTP\u306e\u30ad\u30db\u30f3</td>\n<td align=\"center\">\u306a\u3057</td>\n</tr>\n<tr>\n<td align=\"center\">API</td>\n<td align=\"center\">\u3053\u3070\u3084\u3057</td>\n<td align=\"center\">API\u3067\u904a\u3093\u3067\u307f\u3088\u3046</td>\n<td align=\"center\">\u3042\u308a</td>\n</tr>\n<tr>\n<td align=\"center\">\u672a\u5b9a</td>\n<td align=\"center\">\u672a\u5b9a</td>\n<td align=\"center\">\u672a\u5b9a</td>\n<td align=\"center\"></td>\n</tr>\n<tr>\n<td align=\"center\">Outro</td>\n<td align=\"center\">nasa9084</td>\n<td align=\"center\">\u3054\u6328\u62f6\u30fb\u61c7\u89aa\u4f1a\u53c2\u52a0\u78ba\u8a8d</td>\n<td align=\"center\"></td>\n</tr>\n</tbody>\n</table>\n<h3>\u305d\u306e\u4ed6</h3>\n<h4>\u4f11\u61a9\u6642\u9593\u306b\u3064\u3044\u3066</h4>\n<p><strong>\u53c2\u52a0\u8005\u306e\u65b9\u306b\u306f\u30da\u30c3\u30c8\u30dc\u30c8\u30eb\u306e\u98f2\u307f\u7269\u3068\u3001\u304a\u3084\u3064\u304c\u3067\u307e\u3059\u3002</strong></p>\n<h4>\u30b3\u30f3\u30d4\u30e5\u30fc\u30bf\u306e\u6301\u3061\u8fbc\u307f\u306b\u3064\u3044\u3066</h4>\n<p>\u5404\u30c6\u30fc\u30de\u3067\u306f\u3001\u6642\u9593\u3092\u53d6\u3063\u3066\u6f14\u7fd2\u3092\u884c\u3046\u5834\u5408\u304c\u3042\u308a\u307e\u3059\u3002<br>\n<strong>\u5fc5\u9808\u3067\u306f\u3042\u308a\u307e\u305b\u3093</strong>\u304c\u3001\u4ee5\u4e0b\u306e\u8981\u4ef6\u3092\u6e80\u305f\u3059\u30ce\u30fc\u30c8PC\u3092\u6301\u53c2\u3055\u308c\u308b\u3053\u3068\u3092<strong>\u5f37\u304f\u304a\u3059\u3059\u3081</strong>\u3057\u307e\u3059\u3002</p>\n<ul>\n<li>\n<p>\u30b5\u30af\u30b5\u30af\u52d5\u304fUNIX\u7cfbOS\u642d\u8f09\u30b3\u30f3\u30d4\u30e5\u30fc\u30bf</p>\n</li>\n<li>\n<p>HDD\u7a7a\u304d\u5bb9\u91cf\uff1a5GB\u4ee5\u4e0a</p>\n</li>\n</ul>\n<p>Windows\u3092\u3054\u5229\u7528\u306e\u65b9\u306f\u3001VirtualBox\u4e0a\u3067ubuntu\u3092\u5229\u7528\u3057\u3066\u3044\u305f\u3060\u304f\u3053\u3068\u3092\u304a\u3059\u3059\u3081\u3057\u307e\u3059\u3002</p>\n<p>\u6f14\u7fd2\u3067\u5fc5\u8981\u3068\u306a\u308b\u74b0\u5883\u7b49\u306b\u3064\u3044\u3066\u306f\u3001\u4e0a\u8a18\u304a\u984c\u76ee\u3092\u3054\u78ba\u8a8d\u304f\u3060\u3055\u3044\u3002</p>\n<p>\u306a\u304a\u3001ubuntu \u65e5\u672c\u8a9eRemix(\u6700\u65b0\u7248)\u304a\u3088\u3073\u4eee\u60f3\u30cf\u30fc\u30c9\u30c7\u30a3\u30b9\u30af\u30a4\u30e1\u30fc\u30b8(ubuntu 14.04LTS/ubuntu15.10)\u306f\u4ee5\u4e0b\u304b\u3089\u30c0\u30a6\u30f3\u30ed\u30fc\u30c9\u3059\u308b\u3053\u3068\u304c\u3067\u304d\u307e\u3059\u3002<br>\n<a href=\"https://www.ubuntulinux.jp/home\" rel=\"nofollow\">ubuntu Japanese Team</a></p>\n<h4>\u53c2\u52a0\u8cbb\u306b\u3064\u3044\u3066</h4>\n<p>\u53c2\u52a0\u8cbb\u306f\u4e3b\u3068\u3057\u3066\u3001<strong>\u98f2\u307f\u7269\u4ee3\u3001\u304a\u3084\u3064\u4ee3</strong>\u3001<strong>\u4f1a\u5834\u8cbb</strong>\u306a\u3069\u306b\u5145\u3066\u3089\u308c\u307e\u3059\u3002</p>\n<h4>\u61c7\u89aa\u4f1a\u306b\u3064\u3044\u3066</h4>\n<p>\u53c2\u52a0\u8005\u304c\u3044\u308c\u3070\u3001\u61c7\u89aa\u4f1a\u3092\u4e88\u5b9a\u3057\u3066\u3044\u307e\u3059\u3002\u53c2\u52a0\u8005\u6570\u306b\u3082\u3088\u308a\u307e\u3059\u304c\u3001\u304a\u304a\u3088\u305d\u306e\u4e88\u7b97\u306f3000\u5186\u524d\u5f8c\u3067\u3059\u3002</p>", "address": "\u672d\u5e4c\u5e02\u4e2d\u592e\u533a\u53171\u6761\u67714\u4e01\u76ee1\u756a\u57301\u3000\u30b5\u30c3\u30dd\u30ed\u30d5\u30a1\u30af\u30c8\u30ea\u30fc1\u6761\u9928\u30003\u968e ", "catch": "web\u3063\u307d\u3044\u3053\u3068\u3084\u308b\u3063\u307d\u3044", "accepted": 9, "ended_at": "2016-01-15T22:00:00+09:00", "place": "\u682a\u5f0f\u4f1a\u793e\u30a4\u30f3\u30d5\u30a3\u30cb\u30c3\u30c8\u30eb\u30fc\u30d7\u4f1a\u8b70\u5ba4"}, {"event_url": "http://techcircle.connpass.com/event/23365/", "event_type": "participation", "owner_nickname": "shiraco", "series": {"url": "http://techcircle.connpass.com/", "id": 954, "title": "Tech-Circle"}, "updated_at": "2016-01-14T17:44:24+09:00", "lat": "35.695876800000", "started_at": "2015-12-10T18:30:00+09:00", "hash_tag": "techcircleja", "title": "Tech-Circle Chainer\u3067\u81ea\u7136\u8a00\u8a9e\u51e6\u7406\u3092\u884c\u3044\u7ffb\u8a33\u306b\u6311\u6226(\u30cf\u30f3\u30ba\u30aa\u30f3\uff09", "event_id": 23365, "lon": "139.690339800000", "waiting": 21, "limit": 46, "owner_id": 2268, "owner_display_name": "shiraco", "description": "<h2>Chainer\u3067\u81ea\u7136\u8a00\u8a9e\u51e6\u7406\u3092\u884c\u3044\u3001\u65e5\u672c\u8a9e\u3092\u82f1\u8a9e\u306b\u7ffb\u8a33\u3057\u3088\u3046\uff01\uff01</h2>\n<p>Tech-Circle \u6a5f\u68b0\u5b66\u7fd2\u7de8\u3067\u306f\u30a2\u30d7\u30ea\u30b1\u30fc\u30b7\u30e7\u30f3\u306e\u4e2d\u3067\u6a5f\u68b0\u5b66\u7fd2\u3092\u6d3b\u7528\u3059\u308b\u65b9\u6cd5\u3092\u30cf\u30f3\u30ba\u30aa\u30f3\u5f62\u5f0f\u3067\u5b66\u3093\u3067\u3044\u304d\u307e\u3059\u3002<br>\n\u4eca\u56de\u306f\u3001\u30cb\u30e5\u30fc\u30e9\u30eb\u30cd\u30c3\u30c8\u306e\u5b9f\u88c5\u304c\u7c21\u5358\u306aChainer\u3092\u5229\u7528\u3057\u3066\u6a5f\u68b0\u7ffb\u8a33\u306b\u30c1\u30e3\u30ec\u30f3\u30b8\u3057\u3088\u3046\u3068\u601d\u3044\u307e\u3059\u3002</p>\n<ul>\n<li>\u7c21\u5358\u306a\u6a5f\u68b0\u7ffb\u8a33\u306b\u3064\u3044\u3066\u7406\u89e3\u3059\u308b</li>\n<li>\u30cb\u30e5\u30fc\u30e9\u30eb\u30cd\u30c3\u30c8\u306b\u3064\u3044\u3066\u306e\u6982\u8981\u3092\u7406\u89e3\u3059\u308b</li>\n<li>Chainer\u306e\u958b\u767a\u74b0\u5883\u3092\u69cb\u7bc9\u3059\u308b</li>\n</ul>\n<p>\u300c\u6a5f\u68b0\u7ffb\u8a33\u306e\u5f79\u7acb\u305f\u305b\u65b9\u300d\u300c\u30cb\u30e5\u30fc\u30e9\u30eb\u30cd\u30c3\u30c8\u3067\u6a5f\u68b0\u7ffb\u8a33\u3092\u5b9f\u88c5\u3057\u305f\u3044\u300d\u3001\u305d\u3093\u306a\u4e0d\u5b89\u3084\u7591\u554f\u3092\u89e3\u6d88\u3067\u304d\u308c\u3070\u3068\u601d\u3044\u307e\u3059\u3002</p>\n<p>\u203b\u672c\u30cf\u30f3\u30ba\u30aa\u30f3\u306e\u63a8\u5968OS\u306fMacOS\u3001Linux\u3067\u3059\u3002</p>\n<h2>\u958b\u50ac\u6982\u8981</h2>\n<ul>\n<li>\n<p>\u65e5\u6642: 2015/12/10(\u6728) 18:30-21:30 (18:30- \u53d7\u4ed8&amp;\u30cd\u30c3\u30c8\u30ef\u30fc\u30ad\u30f3\u30b0\u30bf\u30a4\u30e0\u958b\u59cb\u300119:30- \u672c\u7de8\u958b\u59cb)</p>\n</li>\n<li>\n<p>\u5834\u6240: TIS\u682a\u5f0f\u4f1a\u793e \u6771\u4eac\u672c\u793e 14F <a href=\"http://www.tis.co.jp/company/information/network/shinjuku.html\" rel=\"nofollow\">access</a></p>\n</li>\n<li>\n<p>\u6700\u5bc4\u99c5: \u6771\u4eac\u30e1\u30c8\u30ed\u4e38\u30ce\u5185\u7dda\u897f\u65b0\u5bbf\u99c5\u3001JR\u65b0\u5bbf\u99c5\u3001\u4ed6</p>\n</li>\n<li>\n<p>\u5b9a\u54e1: 38\u540d (\u30b9\u30bf\u30c3\u30d5\u542b\u3080)</p>\n<ul>\n<li>\u203b\u62bd\u9078\u65b9\u5f0f\u3092\u63a1\u3063\u3066\u304a\u308a\u307e\u3059\u3002\u62bd\u9078\u65e5\u306f\u4f1a\u306e10\u65e5\u524d\u3092\u4e88\u5b9a\u3057\u3066\u3044\u307e\u3059\u3002</li>\n<li>\u203b\u4e00\u822c\u53c2\u52a0\u306e\u65b9\u306f\u3001\u4e00\u822c\u67a0\u3082\u3057\u304f\u306fLT\u67a0\u306b\u3066\u304a\u7533\u8fbc\u307f\u304f\u3060\u3055\u3044\u3002</li>\n</ul>\n</li>\n</ul>\n<h2>\u61c7\u89aa\u4f1a\u306b\u3064\u3044\u3066</h2>\n<p>\u5e0c\u671b\u8005\u304c\u591a\u3051\u308c\u3070\u3001\u61c7\u89aa\u4f1a\u3092\u3057\u307e\u3059\u3002</p>\n<h2>\u60f3\u5b9a\u53c2\u52a0\u8005\u30bf\u30fc\u30b2\u30c3\u30c8</h2>\n<ul>\n<li>\u4e8b\u524d\u6e96\u5099(\u5f8c\u8ff0)\u3092\u52c9\u5f37\u4f1a\u5f53\u65e5\u307e\u3067\u306b\u5b9f\u65bd\u3057\u3001\u4e8b\u524d\u6e96\u5099\u3057\u305f\u30ce\u30fc\u30c8PC\u3092\u5f53\u65e5\u6301\u53c2\u3067\u304d\u308b</li>\n<li>Python\u3067\u30d7\u30ed\u30b0\u30e9\u30df\u30f3\u30b0\u3067\u304d\u308b</li>\n<li>\u6a5f\u68b0\u5b66\u7fd2\u30fb\u81ea\u7136\u8a00\u8a9e\u51e6\u7406\u306b\u3064\u3044\u3066\u306e\u57fa\u672c\u7684\u306a\u6982\u5ff5\u3092\u7406\u89e3\u3057\u3066\u3044\u308b</li>\n<li>\u30cb\u30e5\u30fc\u30e9\u30eb\u30cd\u30c3\u30c8\u306b\u3064\u3044\u3066\u306e\u57fa\u672c\u7684\u306a\u6982\u5ff5\u3092\u7406\u89e3\u3057\u3066\u3044\u308b</li>\n</ul>\n<h2>\u30bf\u30a4\u30e0\u30b9\u30b1\u30b8\u30e5\u30fc\u30eb</h2>\n<table>\n<thead>\n<tr>\n<th align=\"center\">\u6642\u9593</th>\n<th align=\"center\">\u5185\u5bb9</th>\n<th align=\"center\">\u767b\u58c7\u8005</th>\n</tr>\n</thead>\n<tbody>\n<tr>\n<td align=\"center\">18:30-19:30</td>\n<td align=\"center\">\u53d7\u4ed8&amp;\u30cd\u30c3\u30c8\u30ef\u30fc\u30ad\u30f3\u30b0\u30bf\u30a4\u30e0</td>\n<td align=\"center\"></td>\n</tr>\n<tr>\n<td align=\"center\">19:30-19:35</td>\n<td align=\"center\">Tech-Circle\u306e\u6982\u8981\u8aac\u660e</td>\n<td align=\"center\">@shiraco</td>\n</tr>\n<tr>\n<td align=\"center\">19:35-19:55</td>\n<td align=\"center\">Chainer\u3092\u5229\u7528\u3057\u305f\u6a5f\u68b0\u7ffb\u8a33</td>\n<td align=\"center\">@odashi_t</td>\n</tr>\n<tr>\n<td align=\"center\">19:55-20:05</td>\n<td align=\"center\">\u30cf\u30f3\u30ba\u30aa\u30f3\u6e96\u5099\uff06\u8cea\u554f</td>\n<td align=\"center\"></td>\n</tr>\n<tr>\n<td align=\"center\">20:05-20:25</td>\n<td align=\"center\">Hands on #1 \u30cb\u30e5\u30fc\u30e9\u30eb\u30cd\u30c3\u30c8\u306e\u30d1\u30e9\u30e1\u30fc\u30bf\u8abf\u6574</td>\n<td align=\"center\"></td>\n</tr>\n<tr>\n<td align=\"center\">20:25-20:45</td>\n<td align=\"center\">Hands on #2 \u30c7\u30fc\u30bf\u306e\u5b66\u7fd2\u304b\u3064\u7cbe\u5ea6\u5224\u5b9a</td>\n<td align=\"center\"></td>\n</tr>\n<tr>\n<td align=\"center\">20:45-20:50</td>\n<td align=\"center\">\u8cea\u554f\u30bf\u30a4\u30e0(\u30cf\u30f3\u30ba\u30aa\u30f3\u306e\u30d0\u30c3\u30d5\u30a1)</td>\n<td align=\"center\">\u53c2\u52a0\u8005\u5168\u54e1</td>\n</tr>\n<tr>\n<td align=\"center\">20:50-21:05</td>\n<td align=\"center\">LT\u3000\u6df1\u5c64\u5b66\u7fd2(chainer)\u3067\u30d5\u30ec\u30fc\u30ba\u30d9\u30fc\u30b9\u6a5f\u68b0\u7ffb\u8a33\u306e\u4e26\u3079\u66ff\u3048\u30e2\u30c7\u30eb\u3092\u6539\u5584\u3059\u308b</td>\n<td align=\"center\">@shin_kan0</td>\n</tr>\n<tr>\n<td align=\"center\">21:05-21:10</td>\n<td align=\"center\">\u30a2\u30f3\u30b1\u30fc\u30c8 &amp; \u6b21\u56de\u306e\u6848\u5185</td>\n<td align=\"center\">\u5168\u54e1</td>\n</tr>\n<tr>\n<td align=\"center\">21:10-21:20</td>\n<td align=\"center\">\u7247\u4ed8\u3051</td>\n<td align=\"center\">\u30b9\u30bf\u30c3\u30d5</td>\n</tr>\n</tbody>\n</table>\n<p>\u203b\u30bf\u30a4\u30e0\u30b9\u30b1\u30b8\u30e5\u30fc\u30eb\u306f\u5f53\u65e5\u306e\u9032\u884c\u72b6\u6cc1\u306b\u3088\u308a\u591a\u5c11\u524d\u5f8c\u3059\u308b\u53ef\u80fd\u6027\u304c\u3042\u308a\u307e\u3059\u3002\u3054\u4e86\u627f\u4e0b\u3055\u3044\u3002</p>\n<p><font color=\"red\">\u203b\u53d7\u4ed8\u306f19:30\u307e\u3067\u3059\u3002\u305d\u308c\u4ee5\u964d\u306e\u6765\u5834\u306f\u30cf\u30c3\u30b7\u30e5\u30bf\u30b0#techcircleja\u306b\u3054\u9023\u7d61\u304a\u306d\u304c\u3044\u3057\u307e\u3059\u3002</font></p>\n<h2>\u30cf\u30f3\u30ba\u30aa\u30f3\u8cc7\u6599</h2>\n<p>\u4e8b\u524d\u6e96\u5099\u306e\u8cc7\u6599\u4ee5\u5916\u306f\u30cf\u30f3\u30ba\u30aa\u30f3\u5f8c\u306b\u516c\u958b\u3057\u307e\u3059\u3002</p>\n<ul>\n<li>\n<p>\u4e8b\u524d\u6e96\u5099 <a href=\"http://qiita.com/GushiSnow/items/c0dce54a1ed90fe16c26\" rel=\"nofollow\">Chainer \u30cf\u30f3\u30ba\u30aa\u30f3 \uff5e\u4e8b\u524d\u6e96\u5099\u7de8\uff5e Tech-Circle#11</a></p>\n</li>\n<li>\n<p><a href=\"http://www.slideshare.net/YusukeOda1/encoderdecoder-tis\" rel=\"nofollow\">Chainer\u3092\u5229\u7528\u3057\u3066\u6a5f\u68b0\u7ffb\u8a33\u306b\u30c1\u30e3\u30ec\u30f3\u30b8\u3057\u3088\u3046</a></p>\n</li>\n<li><a href=\"https://github.com/SnowMasaya/Chainer_Machine_Translation_ipython_notebook\" rel=\"nofollow\">Tech Circle ML #11 Chainer\u3092\u5229\u7528\u3057\u3066\u6a5f\u68b0\u7ffb\u8a33\u306b\u30c1\u30e3\u30ec\u30f3\u30b8\u3057\u3088\u3046</a></li>\n</ul>\n<hr>\n<h2>\u5185\u5bb9\u8a73\u7d30</h2>\n<h2>\u4e8b\u524d\u6e96\u5099(\u5f53\u65e5\u307e\u3067) <font color=\"red\">\u25c6\u4e8b\u524d\u6e96\u5099\u306e\u304a\u9858\u3044\u25c6</font></h2>\n<p>\u4eca\u56de\u306f\u5404\u81ea\u306ePC\u4e0a\u3067\u30cf\u30f3\u30ba\u30aa\u30f3\u3092\u3057\u3066\u3044\u305f\u3060\u304f\u3053\u3068\u3092\u60f3\u5b9a\u3057\u3066\u304a\u308a\u307e\u3059\u3002\n\u5f53\u65e5\u306e\u30cf\u30f3\u30ba\u30aa\u30f3\u3092\u30b9\u30e0\u30fc\u30ba\u306b\u9032\u3081\u308b\u305f\u3081\u3001\u4e8b\u524d\u306b\u4ee5\u4e0b\u306e\u6e96\u5099\u3092\u304a\u9858\u3044\u3057\u307e\u3059\u3002</p>\n<p>\u4e0b\u8a18\u4f5c\u696d\u624b\u9806\u306f<a href=\"http://qiita.com/GushiSnow/items/c0dce54a1ed90fe16c26\" rel=\"nofollow\">Tech-Circle#11</a>\u3092\u3054\u89a7\u4e0b\u3055\u3044\u3002</p>\n<p>\u5f53\u65e5\u4f1a\u5834\u306b\u5171\u6709\u306e\u7121\u7ddaLAN\u74b0\u5883\u306f\u3042\u308a\u307e\u3059\u304c\u3001\u5c11\u3057\u3067\u3082\u8ca0\u8377\u3092\u4e0b\u3052\u308b\u305f\u3081\u306b\u4e8b\u524d\u306b\u4e0a\u8a18\u5bfe\u5fdc\u304a\u9858\u3044\u3057\u307e\u3059\u3002\n\u4e8b\u524d\u306b\u5bfe\u5fdc\u304c\u96e3\u3057\u3044\u5834\u5408\u3001\u5f53\u65e5\u306e18:30-19:30\u306b\u4f1a\u5834\u3092\u4e8b\u524d\u958b\u653e\u3044\u305f\u3057\u307e\u3059\u3002\n\u305d\u306e\u6642\u9593\u3067\u5bfe\u5fdc\u3044\u305f\u3060\u3051\u308c\u3070\u3068\u601d\u3044\u307e\u3059\u3002\u305d\u306e\u969b\u306b\u306f\u30b9\u30bf\u30c3\u30d5\u30e1\u30f3\u30d0\u30fc\u3082\u304a\u308a\u307e\u3059\u306e\u3067\u304a\u6c17\u8efd\u306b\u8cea\u554f\u3057\u306a\u304c\u3089\u9032\u3081\u3066\u3044\u305f\u3060\u3051\u308c\u3070\u3068\u601d\u3044\u307e\u3059\u3002</p>\n<p>\u307e\u305f\u3001\u5f53\u65e5NW\u74b0\u5883\u3092\u81ea\u5206\u3067\u6e96\u5099\u53ef\u80fd\u306a\u65b9\u306b\u3064\u304d\u307e\u3057\u3066\u306f\u3001\u3067\u304d\u308b\u9650\u308a\u6301\u53c2\u3044\u305f\u3060\u3051\u308b\u3068\u52a9\u304b\u308a\u307e\u3059\u3002</p>\n<h3>\u53d7\u4ed8&amp;\u30cd\u30c3\u30c8\u30ef\u30fc\u30ad\u30f3\u30b0\u30bf\u30a4\u30e0</h3>\n<p>\u30cd\u30c3\u30c8\u30ef\u30fc\u30ad\u30f3\u30b0\u30bf\u30a4\u30e0\u3068\u3044\u3046\u3053\u3068\u3067\u672c\u7de8\u958b\u59cb\u306e1\u6642\u9593\u524d\u306b\u4f1a\u5834\u3092\u958b\u653e\u3057\u307e\u3059\u3002\n\u3053\u306e\u6642\u9593\u306b\u3001\u53c2\u52a0\u8005\u540c\u58eb\u3067\u306e\u4ea4\u6d41(\u540d\u523a\u4ea4\u63db\u3084Facebook\u306e\u53cb\u9054\u7533\u8acb\u306a\u3069)\u3084\u30cf\u30f3\u30ba\u30aa\u30f3\u306e\u4e8b\u524d\u6e96\u5099\u3001\u30b3\u30fc\u30d2\u30fc\u3084\u304a\u8336\u3092\u98f2\u3093\u3067\u3061\u3087\u3063\u3068\u4f11\u61a9\u306a\u3069\u6709\u52b9\u306b\u6d3b\u7528\u3057\u3066\u3044\u305f\u3060\u3051\u308c\u3070\u3068\u601d\u3063\u3066\u3044\u307e\u3059\u3002</p>\n<p>\u98f2\u307f\u7269\u306e\u6301\u3061\u8fbc\u307f\u306f\u53ef\u80fd\u3067\u3059\u304c\u3001\u4f1a\u5834\u306e\u90fd\u5408\u4e0a\u30a2\u30eb\u30b3\u30fc\u30eb\u306f\u3054\u9060\u616e\u4e0b\u3055\u3044\u3002</p>\n<h3>Chainer\u3067\u81ea\u7136\u8a00\u8a9e\u51e6\u7406\u3092\u884c\u3044\u3001\u65e5\u672c\u8a9e\u3092\u82f1\u8a9e\u306b\u7ffb\u8a33\u3057\u3088\u3046\uff01\uff01</h3>\n<p>\u6a5f\u68b0\u7ffb\u8a33\u306e\u6982\u8981\u3068\u3001\u305d\u306e\u7279\u6027\u306b\u3064\u3044\u3066\u7c21\u5358\u306b\u89e3\u8aac\u3057\u307e\u3059\u3002\u307e\u305f\u3001\u5b9f\u88c5\u3059\u308b\u306b\u5f53\u305f\u308a\u3069\u306e\u3088\u3046\u306a\u9078\u629e\u80a2\u304c\u3042\u308b\u306e\u304b\u3092\u63d0\u793a\u3057\u307e\u3059\u3002\n\u8cc7\u6599\u306f\u30cf\u30f3\u30ba\u30aa\u30f3\u5f8c\u306b\u516c\u958b\u4e88\u5b9a\u3067\u3059\u3002</p>\n<p><a href=\"\" rel=\"nofollow\">Chainer\u3067\u81ea\u7136\u8a00\u8a9e\u51e6\u7406\u3092\u884c\u3044\u3001\u65e5\u672c\u8a9e\u3092\u82f1\u8a9e\u306b\u7ffb\u8a33\u3057\u3088\u3046\uff01\uff01</a></p>\n<h3>Handson</h3>\n<p>\u30cb\u30e5\u30fc\u30e9\u30eb\u30cd\u30c3\u30c8\u30ef\u30fc\u30af\u306e\u30e9\u30a4\u30d6\u30e9\u30eaChainer\u3092\u4f7f\u7528\u3057\u3001\u6a5f\u68b0\u7ffb\u8a33\u3092\u884c\u3046\u305f\u3081\u306e\u57fa\u672c\u7684\u306a\u624b\u9806\u3092\u898b\u3066\u3044\u304d\u307e\u3059\u3002\n\u8cc7\u6599\u306f\u30cf\u30f3\u30ba\u30aa\u30f3\u5f8c\u306b\u516c\u958b\u4e88\u5b9a\u3067\u3059\u3002</p>\n<p><a href=\"http://qiita.com/GushiSnow/private/b0abf7d3dccafe14fa07\" rel=\"nofollow\">Tech Circle ML #11 Chainer\u3067\u81ea\u7136\u8a00\u8a9e\u51e6\u7406\u3092\u884c\u3044\u3001\u65e5\u672c\u8a9e\u3092\u82f1\u8a9e\u306b\u7ffb\u8a33\u3057\u3088\u3046\uff01\uff01</a></p>\n<h3>LT</h3>\n<p>LT(15\u5206\u67a0)\u5927\u4f1a\u3092\u4e88\u5b9a\u3057\u3066\u3044\u307e\u3059\u3002</p>\n<ul>\n<li><a href=\"https://twitter.com/shin_kan0\" rel=\"nofollow\">shin_kan0</a> \u300cLT\u3000\u6df1\u5c64\u5b66\u7fd2(chainer)\u3067\u30d5\u30ec\u30fc\u30ba\u30d9\u30fc\u30b9\u6a5f\u68b0\u7ffb\u8a33\u306e\u4e26\u3079\u66ff\u3048\u30e2\u30c7\u30eb\u3092\u6539\u5584\u3059\u308b\u300d</li>\n</ul>\n<h3>\u30a2\u30f3\u30b1\u30fc\u30c8</h3>\n<p><a href=\"https://goo.gl/5Edbi4\" rel=\"nofollow\">\u30a2\u30f3\u30b1\u30fc\u30c8</a></p>\n<hr>\n<h2>Tech-Circle\u3068\u306f\uff1f</h2>\n<p><a href=\"http://techcircle.connpass.com\" rel=\"nofollow\">\u3053\u3061\u3089</a>\u3092\u3054\u4e00\u8aad\u304f\u3060\u3055\u3044\u3002\n\u300c\u6280\u8853\u306b\u89e6\u308c\u3066\u304d\u3063\u304b\u3051\u3065\u304f\u308a\u3092\u300d\u3092\u30b3\u30f3\u30bb\u30d7\u30c8\u3068\u3057\u3066\u958b\u50ac\u3059\u308b\u52c9\u5f37\u4f1a\u3067\u3059\u3002\nTech-Circle\u3067\u306f\u3001\u30a4\u30f3\u30d5\u30e9\u30a8\u30f3\u30b8\u30cb\u30a2\u5411\u3051\u306e\u6280\u8853\u3068\u30a2\u30d7\u30ea\u30b1\u30fc\u30b7\u30e7\u30f3\u958b\u767a\u8005\u5411\u3051\u306e\u6a5f\u68b0\u5b66\u7fd2\u6280\u8853\u306e\u5927\u304d\u304f2\u3064\u306e\u8ef8\u3092\u30c6\u30fc\u30de\u3068\u3057\u3066\u52c9\u5f37\u4f1a\u3092\u4f01\u753b\u3057\u3066\u3044\u307e\u3059\u3002</p>\n<h3>\u904e\u53bb\u306eTech-Circle\u306e\u52c9\u5f37\u4f1a</h3>\n<ul>\n<li><a href=\"http://techcircle.connpass.com/event/21960/\" rel=\"nofollow\">Tech-Circle #10: Tech-Circle Spark\u3067\u30c4\u30a4\u30fc\u30c8\u3092\u30ea\u30a2\u30eb\u30bf\u30a4\u30e0\u89e3\u6790\u3059\u308bWeb\u30a2\u30d7\u30ea\u306e\u958b\u767a(\u30cf\u30f3\u30ba\u30aa\u30f3)</a></li>\n<li><a href=\"http://techcircle.connpass.com/event/20042/\" rel=\"nofollow\">Tech-Circle #9: Tech-Circle Chainer\u3092\u7528\u3044\u305f\u81ea\u7136\u8a00\u8a9e\u51e6\u7406\u3067\u30bd\u30fc\u30b9\u30b3\u30fc\u30c9\u81ea\u52d5\u751f\u6210\u306b\u6311\u6226(\u30cf\u30f3\u30ba\u30aa\u30f3) </a></li>\n<li><a href=\"http://techcircle.connpass.com/event/18906/\" rel=\"nofollow\">Tech-Circle #8: Chef Meetup (Tech-Circle&amp;CreationLine\u5171\u50ac)</a></li>\n</ul>\n<p>\u5168\u3066\u306e\u904e\u53bb\u306e\u30a4\u30d9\u30f3\u30c8\u306f<a href=\"http://techcircle.connpass.com/event/\" rel=\"nofollow\">\u3053\u3061\u3089</a></p>\n<h2>\u9023\u7d61\u5148</h2>\n<p>\u3054\u8cea\u554f\u7b49\u306fTwitter\u306b\u3066\n<a href=\"https://twitter.com/ike_dai\" rel=\"nofollow\">@ike_dai</a>\u3082\u3057\u304f\u306f<a href=\"https://twitter.com/shiraco\" rel=\"nofollow\">@shiraco</a>\u307e\u3067\u3054\u9023\u7d61\u304f\u3060\u3055\u3044\u3002</p>\n<h2>\u30cf\u30c3\u30b7\u30e5\u30bf\u30b0</h2>\n<p>\u3053\u306e\u30a4\u30d9\u30f3\u30c8\u306e\u30cf\u30c3\u30b7\u30e5\u30bf\u30b0\u306f<a href=\"https://twitter.com/hashtag/techcircleja?f=realtime\" rel=\"nofollow\"><strong>#techcircleja</strong></a>\u3067\u3059\uff01</p>", "address": "\u6771\u4eac\u90fd\u65b0\u5bbf\u533a\u897f\u65b0\u5bbf8-17-1\u3000 \u4f4f\u53cb\u4e0d\u52d5\u7523\u65b0\u5bbf\u30b0\u30e9\u30f3\u30c9\u30bf\u30ef\u30fc 14\uff26", "catch": "Tech-Circle #11 Chainer Handson", "accepted": 45, "ended_at": "2015-12-10T21:30:00+09:00", "place": "TIS\u682a\u5f0f\u4f1a\u793e \u6771\u4eac\u672c\u793e"}, {"event_url": "http://tokyosharingeconomy.connpass.com/event/25214/", "event_type": "participation", "owner_nickname": "hsekine", "series": {"url": "http://tokyosharingeconomy.connpass.com/", "id": 1749, "title": "Tokyo Sharing Economy Startups"}, "updated_at": "2016-01-14T15:47:31+09:00", "lat": "35.672853900000", "started_at": "2016-01-22T18:30:00+09:00", "hash_tag": "", "title": "Sharing Economy Tech Meetup", "event_id": 25214, "lon": "139.709821900000", "waiting": 0, "limit": 30, "owner_id": 68167, "owner_display_name": "hsekine", "description": "<h1>\u6025\u6210\u9577\u3057\u3066\u3044\u308b\u30b5\u30fc\u30d3\u30b9\u304b\u3089\u5b66\u3076\u958b\u767a\u306e\u30b3\u30c4</h1>\n<p>Sharing Economy Tech Meetup\u3068\u306f\u4eca\u52e2\u3044\u306e\u3042\u308b\u30b7\u30a7\u30a2\u30ea\u30f3\u30b0\u30a8\u30b3\u30ce\u30df\u30fc\u95a2\u9023\u306e\u30b9\u30bf\u30fc\u30c8\u30a2\u30c3\u30d7\u3092\u4e2d\u5fc3\u3068\u3057\u305f\u3001\u30a8\u30f3\u30b8\u30cb\u30a2\u5411\u3051\u306e\u30df\u30fc\u30c8\u30a2\u30c3\u30d7(\u30a4\u30d9\u30f3\u30c8)\u3067\u3059\u3002\n\u6bce\u56de\u30a4\u30d9\u30f3\u30c8\u306e\u5f8c\u534a\u306b\u884c\u3046\u61c7\u89aa\u4f1a\u3067\u306f\u8efd\u98df\u3092\u4ea4\u3048\u306a\u304c\u3089\u53c2\u52a0\u8005\u540c\u58eb\u3067\u60c5\u5831\u4ea4\u63db\u3057\u3066\u3044\u305f\u3060\u3051\u308b\u5834\u3092\u3082\u3046\u3051\u307e\u3059\u306e\u3067\u3001\u540c\u3058\u8208\u5473\u3092\u6301\u3063\u305f\u65b9\u3005\u3068\u7e4b\u304c\u308b\u6a5f\u4f1a\u306b\u3057\u3066\u3044\u305f\u3060\u3051\u308c\u3070\u3068\u601d\u3044\u307e\u3059\u3002</p>\n<p>\u4eca\u56de\u306f\u8a18\u5ff5\u3059\u3079\u304d\u7b2c1\u56de\u3068\u3044\u3046\u3053\u3068\u3067\u8c6a\u83ef\u306a\u65b9\u3005\u306b\u96c6\u307e\u3063\u3066\u3044\u305f\u3060\u304d\u307e\u3057\u305f\uff01\uff01\n\u6b21\u306e4\u793e\u3088\u308a\u30b7\u30a7\u30a2\u30ea\u30f3\u30b0\u30a8\u30b3\u30ce\u30df\u30fc\u306e\u53ef\u80fd\u6027\u306b\u3064\u3044\u3066\u3001\u307e\u305f\u5404\u793e\u306e\u5177\u4f53\u7684\u306a\u30b5\u30fc\u30d3\u30b9\u958b\u767a\u306b\u3064\u3044\u3066\u304a\u8a71\u3057\u3057\u307e\u3059\u3002</p>\n<p>\u30fb\u682a\u5f0f\u4f1a\u793e\u30b9\u30da\u30fc\u30b9\u30de\u30fc\u30b1\u30c3\u30c8\uff08SPACEMARKET\uff09</p>\n<p>\u30fb\u682a\u5f0f\u4f1a\u793e\u30ec\u30ec\u30ec\uff08TimeTicket\uff09</p>\n<p>\u30fb\u682a\u5f0f\u4f1a\u793eSQUEEZE\uff08Mister Suite\uff09</p>\n<p>\u30fb\u682a\u5f0f\u4f1a\u793e\u30ea\u30af\u30eb\u30fc\u30c8\u30ad\u30e3\u30ea\u30a2(IT\u6226\u7565\u5ba4)</p>\n<h3>\uff1c\u30bf\u30a4\u30e0\u30b9\u30b1\u30b8\u30e5\u30fc\u30eb\uff1e</h3>\n<p>\u30fb\u65e5\u6642\uff1a1/22 (\u91d1) 19:00-21:30</p>\n<p>\u30fb\u5834\u6240\uff1akurkku home \n\u3000\u3000\u3000\u3000\n\u3012150-0001 \u6771\u4eac\u90fd\u6e0b\u8c37\u533a\u795e\u5bae\u524d2-18-21\u3000(<a href=\"http://www.kurkku-home.jp/\" rel=\"nofollow\">http://www.kurkku-home.jp/</a>)</p>\n<table>\n<thead>\n<tr>\n<th align=\"left\">\u6642\u9593</th>\n<th align=\"left\">\u767a\u8868\u8005</th>\n<th>\u5185\u5bb9</th>\n</tr>\n</thead>\n<tbody>\n<tr>\n<td align=\"left\">18:45 \u301c 19:00</td>\n<td align=\"left\">-</td>\n<td>\u53d7\u4ed8</td>\n</tr>\n<tr>\n<td align=\"left\">19:00 \u301c 19:05</td>\n<td align=\"left\">\u8218\u6797 \u771f\u4e00(\u682a\u5f0f\u4f1a\u793eSQUEEZE CEO)</td>\n<td>\u6328\u62f6 &amp; \u767b\u58c7\u8005\u3054\u7d39\u4ecb</td>\n</tr>\n<tr>\n<td align=\"left\">19:05 \u301c 19:20</td>\n<td align=\"left\">\u91cd\u677e \u5927\u8f14(\u682a\u5f0f\u4f1a\u793e\u30b9\u30da\u30fc\u30b9\u30de\u30fc\u30b1\u30c3\u30c8CEO)</td>\n<td>\u30b7\u30a7\u30a2\u30ea\u30f3\u30b0\u30a8\u30b3\u30ce\u30df\u30fc\u306b\u3064\u3044\u3066</td>\n</tr>\n<tr>\n<td align=\"left\">19:20 \u301c 19:40</td>\n<td align=\"left\">\u5c71\u672c \u5927\u7b56(\u682a\u5f0f\u4f1a\u793e\u30ec\u30ec\u30ec CEO)</td>\n<td>\u5931\u6557\u3057\u306b\u304f\u3044\u30b5\u30fc\u30d3\u30b9\u306e\u4f5c\u308a\u65b9</td>\n</tr>\n<tr>\n<td align=\"left\">19:40 \u301c 20:00</td>\n<td align=\"left\">\u95a2\u6839 \u88d5\u7d00(\u682a\u5f0f\u4f1a\u793eSQUEEZE CTO)</td>\n<td>Mister Suite\u3092\u652f\u3048\u308b\u6280\u8853</td>\n</tr>\n<tr>\n<td align=\"left\">20:00 \u301c 20:20</td>\n<td align=\"left\">\u7530\u4e2d \u60a0\u6a39(\u682a\u5f0f\u4f1a\u793e\u30ea\u30af\u30eb\u30fc\u30c8\u30ad\u30e3\u30ea\u30a2 IT\u6226\u7565\u5ba4 \u30c6\u30af\u30cb\u30ab\u30eb\u30de\u30cd\u30fc\u30b8\u30e3\u30fc)</td>\n<td>\u6b63\u89e3\u306e\u306a\u3044\u30b5\u30fc\u30d3\u30b9\u306e\u4f5c\u308a\u65b9</td>\n</tr>\n<tr>\n<td align=\"left\">20:30 \u301c 21:30</td>\n<td align=\"left\">-</td>\n<td>\u61c7\u89aa\u4f1a</td>\n</tr>\n</tbody>\n</table>\n<h3>\uff1c\u3053\u3093\u306a\u65b9\u306b\u304a\u3059\u3059\u3081\uff01\uff1e</h3>\n<p>\u30fb\u62e1\u5927\u671f\u306e\u30b9\u30bf\u30fc\u30c8\u30a2\u30c3\u30d7\u306b\u8208\u5473\u306e\u3042\u308b\u65b9</p>\n<p>\u30fb\u30b7\u30a7\u30a2\u30ea\u30f3\u30b0\u30a8\u30b3\u30ce\u30df\u30fc\u306b\u8208\u5473\u306e\u3042\u308b\u65b9</p>\n<p>\u30fb\u30b5\u30fc\u30d3\u30b9\u958b\u767a\u306b\u8208\u5473\u306e\u3042\u308b\u65b9</p>\n<p>\u30fb\u3044\u307e\u52e2\u3044\u306e\u3042\u308b\u696d\u754c\u306e\u958b\u767a\u306b\u3064\u3044\u3066\u77e5\u308a\u305f\u3044\u65b9\n\u3000</p>\n<h3>\uff1c\u30a4\u30d9\u30f3\u30c8\u6982\u8981\uff1e</h3>\n<p>\u6700\u8fd1\u826f\u304f\u8033\u306b\u3059\u308b\u6c11\u6cca\u3068\u3044\u3046\u8a00\u8449\u3067\u6709\u540d\u306aAirbnb\u306a\u3069\u4f59\u3063\u3066\u3044\u308b\u30e2\u30ce\u3084\u6642\u9593\u3001\u5834\u6240\u3092\u4eca\u5fc5\u8981\u3068\u3057\u3066\u3044\u308b\u4eba\u306b\u63d0\u4f9b\u3059\u308b\u30b7\u30a7\u30a2\u30ea\u30f3\u30b0\u30a8\u30b3\u30ce\u30df\u30fc\u3068\u3044\u3046\u6982\u5ff5\u304c\u6b27\u7c73\u3060\u3051\u3067\u306a\u304f\u65e5\u672c\u306b\u3082\u5e83\u307e\u3063\u3066\u304d\u3066\u3044\u307e\u3059\u3002\u3053\u306e\u767a\u5c55\u306b\u4f34\u3044\u3001\u30b7\u30a7\u30a2\u30ea\u30f3\u30b0\u30a8\u30b3\u30ce\u30df\u30fc\u306b\u95a2\u3059\u308b\u60c5\u5831\u3084\u6280\u8853\u3092\u5171\u6709\u3059\u308b\u30cd\u30c3\u30c8\u30ef\u30fc\u30af\u3092\u4f5c\u308d\u3046\uff01\u3068\u3044\u3046\u3053\u3068\u3067\u4eca\u56de\u306e\u30a4\u30d9\u30f3\u30c8\u958b\u50ac\u306b\u81f3\u308a\u307e\u3057\u305f\u3002\u30c8\u30fc\u30af\u306e\u5185\u5bb9\u306f\u3001\u6280\u8853\u3088\u308a\u3068\u306a\u3063\u3066\u304a\u308a\u307e\u3059\u304c\u3001\u30a8\u30f3\u30b8\u30cb\u30a2\u3067\u306a\u3044\u65b9\u3082\u3054\u8208\u5473\u304c\u3042\u308c\u3070\u596e\u3063\u3066\u3054\u5fdc\u52df\u304f\u3060\u3055\u3044\uff01</p>\n<h3>\uff1c\u767b\u58c7\u8005\u7d39\u4ecb\uff1e</h3>\n<h4>\u30fb<a href=\"https://spacemarket.com/\" rel=\"nofollow\">\u300cSPACEMARKET\u300d</a></h4>\n<h6>\u682a\u5f0f\u4f1a\u793e\u30b9\u30da\u30fc\u30b9\u30de\u30fc\u30b1\u30c3\u30c8 \u4ee3\u8868\u53d6\u7de0\u5f79 CEO \u91cd\u677e \u5927\u8f14</h6>\n<p>2000\u5e74NTT\u6771\u65e5\u672c\u5165\u793e\u3002\u4e3b\u306b\u6cd5\u4eba\u55b6\u696d\u4f01\u753b\u3001\u30d7\u30ed\u30e2\u30fc\u30b7\u30e7\u30f3\uff08PR\u8a8c\u7de8\u96c6\u9577\uff09\u7b49\u3092\u62c5\u5f53\u3002 2006\u5e74\u3001\u5f53\u664210\u6570\u540d\u306e\u682a\u5f0f\u4f1a\u793e\u30d5\u30a9\u30c8\u30af\u30ea\u30a8\u30a4\u30c8\u306b\u53c2\u753b\u3002 \u4e00\u8cab\u3057\u3066\u65b0\u898f\u4e8b\u696d\u3001\u5e83\u5831\u3001\u63a1\u7528\u306b\u5f93\u4e8b\u3002\u56fd\u5185\u5916\u4f01\u696d\u3068\u306e\u30a2\u30e9\u30a4\u30a2\u30f3\u30b9\u5b9f\u7e3e\u591a\u6570\u3002 \u30bc\u30ed\u304b\u3089\u7acb\u3061\u4e0a\u3052\u305f\u30a6\u30a7\u30c7\u30a3\u30f3\u30b0\u4e8b\u696d\u306f\u73fe\u5728\u3001\u5168\u56fd\u3067\u5e74\u9593\u7d043\u4e07\u7d44\u306e\u7d50\u5a5a\u62ab\u9732\u5bb4\u3067 \u5c0e\u5165\u3055\u308c\u308b\u30b5\u30fc\u30d3\u30b9\u307e\u3067\u306b\u80b2\u3064\u30022013\u5e747\u6708\u6771\u8a3c\u30de\u30b6\u30fc\u30ba\u4e0a\u5834\u3092\u7d4c\u9a13\u30022014\u5e741\u6708\u3001\u682a\u5f0f\u4f1a\u793e\u30b9\u30da\u30fc\u30b9\u30de\u30fc\u30b1\u30c3\u30c8\u3092\u5275\u696d\u3002</p>\n<h4>\u30fb<a href=\"https://www.timeticket.jp/\" rel=\"nofollow\">\u300cTime Ticket\u300d</a></h4>\n<h6>\u682a\u5f0f\u4f1a\u793e\u30ec\u30ec\u30ec \u4ee3\u8868\u53d6\u7de0\u5f79 CEO \u5c71\u672c \u5927\u7b56</h6>\n<p>\u307f\u305a\u307b\u60c5\u5831\u7dcf\u7814\u682a\u5f0f\u4f1a\u793e\u3001\u30d5\u30a3\u30fc\u30c9\u30d1\u30b9\u682a\u5f0f\u4f1a\u793e\u3001\u682a\u5f0f\u4f1a\u793e\u30ea\u30af\u30eb\u30fc\u30c8\u30e1\u30c7\u30a3\u30a2\u30b3\u30df\u30e5\u30cb\u30b1\u30fc\u30b7\u30e7\u30f3\u30ba\u3092\u7d4c\u3066\u30012012\u5e742\u6708\u306b\u30b3\u30fc\u30d2\u30fc1\u676f\u3092\u98f2\u3080\u6642\u9593\u3092\u4e00\u7dd2\u306b\u904e\u3054\u3057\u305f\u3044\u4eba\u3068\u51fa\u4f1a\u3048\u308b\u30b5\u30fc\u30d3\u30b9\u300cCoffeeMeeting\u300d\u3092\u500b\u4eba\u958b\u767a\u3057\u30ea\u30ea\u30fc\u30b9\u30022012\u5e745\u6708\u306b\u682a\u5f0f\u4f1a\u793e\u30ec\u30ec\u30ec\u3092\u8a2d\u7acb\u30022014\u5e747\u6708\u3001\u500b\u4eba\u304c\u6c17\u8efd\u306b\u7a7a\u304d\u6642\u9593\u3092\u58f2\u8cb7\u3067\u304d\u308b\u30b5\u30fc\u30d3\u30b9\u300cTimeTicket\u300d\u3092\u30ea\u30ea\u30fc\u30b9\u3002\n\u300cTimeTicket\u300d\u3067\u306f\u30ea\u30ea\u30fc\u30b9\u5f8c3\u30f6\u6708\u3067\u7d045,000\u679a\u306e\u30c1\u30b1\u30c3\u30c8\u304c\u767a\u884c\u3055\u308c\u3001\u58f2\u308c\u305f\u6642\u9593\u306e\u5408\u8a08\u30821,000\u6642\u9593\u3092\u8d85\u3048\u308b\u306a\u3069\u3001\u8a71\u984c\u3092\u547c\u3093\u3067\u3044\u308b\u3002\n\u3000</p>\n<h4>\u30fb<a href=\"https://www.mistersuite.com/\" rel=\"nofollow\">\u300cMister Suite\u300d</a></h4>\n<h6>\u682a\u5f0f\u4f1a\u793eSQUEEZE \u4ee3\u8868\u53d6\u7de0\u5f79 CEO\u3000\u8218\u6797 \u771f\u4e00</h6>\n<p>\u6771\u6d77\u5927\u5b66\u653f\u6cbb\u7d4c\u6e08\u5b66\u90e8\u5352\u696d\u5f8c\u3001\u30b4\u30fc\u30eb\u30c9\u30de\u30f3\u30b5\u30c3\u30af\u30b9\u8a3c\u5238\u30b7\u30f3\u30ac\u30dd\u30fc\u30eb\u652f\u793e\u306b\u52e4\u52d9\u3002\u305d\u306e\u5f8c\u3001\u30c8\u30ea\u30c3\u30d7\u30a2\u30c9\u30d0\u30a4\u30b6\u30fc\u682a\u5f0f\u4f1a\u793e\u30b7\u30f3\u30ac\u30dd\u30fc\u30eb\u652f\u793e\u306b\u3066\u30c7\u30a3\u30b9\u30d7\u30ec\u30a4\u5e83\u544a\u306e\u904b\u7528\u3092\u62c5\u5f53\u30022014\u5e749\u6708\u3001\u682a\u5f0f\u4f1a\u793eSQUEEZE\u3092\u5275\u696d\u3057\u4ee3\u8868\u53d6\u7de0\u5f79CEO\u306b\u5c31\u4efb\u3002</p>\n<h6>\u682a\u5f0f\u4f1a\u793eSQUEEZE \u53d6\u7de0\u5f79 CTO\u3000\u95a2\u6839 \u88d5\u7d00</h6>\n<p>\u8907\u6570\u306e\u30b9\u30bf\u30fc\u30c8\u30a2\u30c3\u30d7\u3001\u30d9\u30f3\u30c1\u30e3\u30fc\u4f01\u696d\u306b\u3066\u65b0\u898f\u30b5\u30fc\u30d3\u30b9\u958b\u767a\u3084\u30de\u30cd\u30b8\u30e1\u30f3\u30c8\u3092\u7d4c\u9a13\u30022015\u5e7410\u6708\u3088\u308aCTO\u306b\u5c31\u4efb\u3002\u30b3\u30df\u30e5\u30cb\u30c6\u30a3\u6d3b\u52d5\u3068\u3057\u3066\u3001PyCon JP 2015 \u526f\u5ea7\u9577\u3001\u300cPython\u3082\u304f\u3082\u304f\u4f1a\u300d\u306e\u4e3b\u50ac\u3002\u5171\u8457\u66f8\u306b\u300ePython\u30a8\u30f3\u30b8\u30cb\u30a2\u990a\u6210\u8aad\u672c\uff082015 \u6280\u8853\u8a55\u8ad6\u793e\u520a\uff09\u300f\u304c\u3042\u308b\u3002</p>\n<h4>\u30fb<a href=\"https://www.recruitcareer.co.jp/\" rel=\"nofollow\">\u300c\u30ea\u30af\u30eb\u30fc\u30c8\u30ad\u30e3\u30ea\u30a2\u300d</a></h4>\n<h6>\u682a\u5f0f\u4f1a\u793e\u30ea\u30af\u30eb\u30fc\u30c8\u30ad\u30e3\u30ea\u30a2  IT\u6226\u7565\u5ba4 \u30c6\u30af\u30cb\u30ab\u30eb\u30de\u30cd\u30fc\u30b8\u30e3\u30fc \u7530\u4e2d \u60a0\u6a39</h6>\n<p>\u65b0\u5352\u3067\u30b4\u30fc\u30eb\u30c9\u30de\u30f3\u30b5\u30c3\u30af\u30b9\u8a3c\u5238\u306b\u5165\u793e\u3002\u30c6\u30af\u30ce\u30ed\u30b8\u30fc\u90e8\u306b\u3066\u3001\u682a\u5f0f\u30fb\u50b5\u5238\u306e\u6c7a\u6e08\u30b7\u30b9\u30c6\u30e0\u306e\u69cb\u7bc9\u306b\u643a\u308f\u308b\u3002\u4e3b\u306b\u6771\u5357\u30a2\u30b8\u30a2\u3084\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2\u306e\u6c7a\u6e08\u30b7\u30b9\u30c6\u30e0\u306e\u8a2d\u8a08\u3001\u5b9f\u88c5\u3084\u3001\u65e5\u672c\u9280\u884c\u3068\u306e\u65b0\u65e5\u9280\u6c7a\u6e08\u30b7\u30b9\u30c6\u30e0\u306e\u4ed5\u69d8\u8a70\u3081\u3084\u5b9f\u88c5\u306b\u643a\u308f\u308b\u3002\n\u305d\u306e\u5f8c\u3001\u682a\u5f0f\u4f1a\u793e\u30a8\u30cb\u30bf\u30a4\u30e0\u30ba\u306b\u8ee2\u5411\u3057\u3001\u540c\u793e\u306b\u3066CTO\u3092\u7d4c\u9a13\u3002\u4ed5\u69d8\u8a2d\u8a08\u3084\u30b3\u30fc\u30c7\u30a3\u30f3\u30b0\u3001\u30a4\u30f3\u30d5\u30e9\u306e\u7ba1\u7406\u304b\u3089\u63a1\u7528\u307e\u3067IT\u30b9\u30bf\u30fc\u30c8\u30a2\u30c3\u30d7\u306e\u6280\u8853\u306b\u95a2\u308f\u308b\u7bc4\u56f2\u3092\u7db2\u7f85\u3059\u308b\u3002\n2015\u5e748\u6708\u3088\u308a\u3001\u682a\u5f0f\u4f1a\u793e\u30ea\u30af\u30eb\u30fc\u30c8\u30ad\u30e3\u30ea\u30a2\u306b\u8ee2\u7c4d\u3002\u4eba\u6750\u9818\u57df\u306e\u65b0\u898f\u4e8b\u696d\u7acb\u3061\u4e0a\u3052\u90e8\u7f72\u306b\u304a\u3044\u3066\u3001\u30a8\u30f3\u30b8\u30cb\u30a2\u30b0\u30eb\u30fc\u30d7\u306e\u30c6\u30af\u30cb\u30ab\u30eb\u30de\u30cd\u30fc\u30b8\u30e3\u30fc\u3068\u3057\u3066\u30d3\u30b8\u30cd\u30b9\u30fb\u30a8\u30f3\u30b8\u30cb\u30a2\u30ea\u30f3\u30b0\u4e21\u9762\u306e\u30de\u30cd\u30fc\u30b8\u30e1\u30f3\u30c8\u3092\u884c\u3046\u3002\u307e\u305f\u3001\u305d\u306e\u4e2d\u3067\u3082\u30ea\u30af\u30eb\u30fc\u30c8\u30ad\u30e3\u30ea\u30a2\u304b\u3089\u30ea\u30ea\u30fc\u30b9\u3057\u3066\u3044\u308b\u30a2\u30d7\u30ea\u3001\u201d\u30b3\u30b7\u30b4\u30c8\u201d\u306e\u30d7\u30ed\u30c0\u30af\u30c8CTO\u3092\u517c\u52d9\u3002\n2015\u5e7410\u6708\u3088\u308a\u30ea\u30af\u30eb\u30fc\u30c8\u30c6\u30af\u30ce\u30ed\u30b8\u30fc\u30ba\u306b\u51fa\u5411\u3057\u3001\u6280\u8853\u30de\u30cd\u30fc\u30b8\u30e1\u30f3\u30c8\u3060\u3051\u3067\u306a\u304f\u3001\u30a8\u30f3\u30b8\u30cb\u30a2\u80b2\u6210\u306b\u3082\u53d6\u308a\u7d44\u3080\u3002</p>\n<h2>\u305d\u306e\u4ed6</h2>\n<p>\u8cea\u554f\u7b49\u3054\u3056\u3044\u307e\u3057\u305f\u3089 hsekine@squeeze<a href=\"http://-inc.co.jp\" rel=\"nofollow\">-inc.co.jp</a> \u307e\u3067\u304a\u9858\u3044\u3044\u305f\u3057\u307e\u3059\u3002</p>", "address": "\u3012150-0001 \u6771\u4eac\u90fd\u6e0b\u8c37\u533a\u795e\u5bae\u524d2\u4e01\u76ee18-21", "catch": "\u30b7\u30a7\u30a2\u30ea\u30f3\u30b0\u30a8\u30b3\u30ce\u30df\u30fc\u95a2\u9023\u306e\u30b9\u30bf\u30fc\u30c8\u30a2\u30c3\u30d7\u3092\u4e2d\u5fc3\u3068\u3057\u305f\u30a8\u30f3\u30b8\u30cb\u30a2\u5411\u3051\u306e\u30a4\u30d9\u30f3\u30c8\uff08\u30df\u30fc\u30c8\u30a2\u30c3\u30d7\uff09\u3067\u3059\u3002", "accepted": 0, "ended_at": "2016-01-22T22:00:00+09:00", "place": "kurkku home"}], "results_start": 1, "results_available": 683}
"""