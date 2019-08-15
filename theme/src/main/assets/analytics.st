<!--Google Analytics-->
<script type="text/plain" class="optanon-category-2">
  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', '$page.properties.("google.analytics.account")$']);
  _gaq.push(['_setDomainName', '$page.properties.("google.analytics.domain.name")$']);
  _gaq.push(['_trackPageview']);
  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })()
</script>
<!-- Google Tag Manager -->
<script type="text/plain" class="optanon-category-2">
  (function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
  new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
  j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
  'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
  })(window,document,'script','dataLayer','GTM-KBJGH35');
</script>
<!--Marketo-->
<script type="text/plain" class="optanon-category-3">
  (function() {
      var didInit = false;
      function initMunchkin() {
      if(didInit === false) {
        didInit = true;
        Munchkin.init('558-NCX-702', { 'asyncOnly': true, 'disableClickDelay': true });
      }
      }
      var s = document.createElement('script');
      s.type = 'text/javascript';
      s.async = true;
      s.src = '//munchkin.marketo.net/munchkin.js';
      s.onreadystatechange = function() {
      if (this.readyState == 'complete' || this.readyState == 'loaded') {
        initMunchkin();
      }
      };
      s.onload = initMunchkin;
      document.getElementsByTagName('head')[0].appendChild(s);
    })();
</script>