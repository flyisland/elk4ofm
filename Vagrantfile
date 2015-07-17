# -*- mode: ruby -*-
# vi: set ft=ruby :

# All Vagrant configuration is done below. The "2" in Vagrant.configure
# configures the configuration version (we support older styles for
# backwards compatibility). Please don't change it unless you know what
# you're doing.
Vagrant.configure(2) do |config|

  config.vm.define "elk" , primary: true do |elk| # ansible host
    # https://googledrive.com/host/0B4tZlTbOXHYWVGpHRWZuTThGVUE/centos65_virtualbox_50G.box
    elk.vm.box = "centos65_virtualbox_50G"
    elk.vm.hostname = "elk.example.com"
    elk.vm.synced_folder "R:/", "/ramdisk"
    elk.vm.synced_folder "R:/", "/software"

    elk.vm.network :private_network, ip: "10.10.10.10"
  end

end
